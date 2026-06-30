class Solution {
    public int characterReplacement(String s, int k) {
        int freq = 0;
        int longest = 0;
        int left = 0;
        int right = 0;
        int[] charIndex = new int[26];

        while(right < s.length()){
            charIndex[s.charAt(right) - 'A']++;
            freq = Math.max(freq, charIndex[s.charAt(right) - 'A']);

            while((right - left + 1) - freq > k){
                charIndex[s.charAt(left) - 'A']--;
                freq = Math.max(freq, charIndex[s.charAt(left) - 'A']);
                left++;
            }
            longest = Math.max(longest, right - left + 1);
            right++;
        }

        return longest;
    }
}
