class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Chars = new int[26];
        int[] s2Chars = new int[26];

        for(int i = 0; i < s1.length(); i++){
            s1Chars[s1.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = 0;

        while(right < s2.length()){
            s2Chars[s2.charAt(right) - 'a']++;
            if(right - left == s1.length()-1){
                if(Arrays.equals(s1Chars, s2Chars)){
                    return true;
                } else {
                    s2Chars[s2.charAt(left) - 'a']--;
                    left++;
                }
            }
            right++;
        }

        return false;
    }
}
