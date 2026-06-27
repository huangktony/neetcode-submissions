class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int longest = 0;
        Set<Character> charSet = new HashSet<>();

        while(right < s.length()){
            if(!charSet.add(s.charAt(right))){
                while(charSet.contains(s.charAt(right))){
                    charSet.remove(s.charAt(left));
                    left++;
                }
            }
            
            charSet.add(s.charAt(right));
            longest = Math.max(longest, right - left + 1);
            right++;
        }

        return longest;
    }
}
