class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sc = new int[26];
        int[] tc = new int[26];

        if(s.length() != t.length()) return false;

        for(int i = 0; i < s.length(); i++){
            sc[s.charAt(i) - 'a']++;
            tc[t.charAt(i) - 'a']++;
        }

        String res1 = Arrays.toString(sc);
        String res2 = Arrays.toString(tc);
        return (res1.equals(res2));
    }
}
