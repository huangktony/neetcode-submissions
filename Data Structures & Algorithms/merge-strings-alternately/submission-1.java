class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int w1 = 0;
        int w2 = 0;

        while((w1 < word1.length()) && (w2 < word2.length())){
            res.append(word1.charAt(w1));
            res.append(word2.charAt(w2));
            w1++;
            w2++;
        }

        res.append(word1.substring(w1));
        res.append(word2.substring(w2));


        return res.toString();
    }
}