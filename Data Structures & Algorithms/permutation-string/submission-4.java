class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Counts = new int[26];
        int[] windowCounts = new int[26];
        int left = 0;
        int right = 0;

        for(int i = 0; i < s1.length(); i++){
            s1Counts[s1.charAt(i) - 'a']++;
        }

        while(right < s2.length()){
            windowCounts[s2.charAt(right) - 'a']++;

            if((right - left + 1) > s1.length()){
                windowCounts[s2.charAt(left) - 'a']--;
                left++;
            }

            if(Arrays.equals(s1Counts, windowCounts)) return true;

            right++;
        }

        return false;
    }
}
