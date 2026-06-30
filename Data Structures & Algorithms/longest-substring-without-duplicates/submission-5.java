class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int longest = 0;
        Set<Character> curString = new HashSet<>();

        while(right < s.length()){
            while(!curString.add(s.charAt(right))){
                curString.remove(s.charAt(left));
                left++;
            }
            longest = Math.max(longest, right-left+1);
            right++;
        }

        return longest;
    }
}
