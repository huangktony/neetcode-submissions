class Solution {
    public int characterReplacement(String s, int k) {
        int mostFreq = 0;
        int longest = 0;
        int left = 0;
        int right = 0;
        int[] charFreq = new int[26];

        while(right < s.length()){
            charFreq[s.charAt(right) - 'A']++;
            mostFreq = Math.max(mostFreq, charFreq[s.charAt(right) - 'A']);
            while((right - left + 1) - mostFreq > k){
                charFreq[s.charAt(left) - 'A']--;
                left++;
            }
            longest = Math.max(longest, right - left + 1);
            right++;
        }

        return longest;
    }
}
