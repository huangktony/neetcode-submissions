class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for(String s : strs){
            char[] temp = s.toCharArray();
            Arrays.sort(temp);
            String anagram = Arrays.toString(temp);

            anagramGroups.computeIfAbsent(anagram, k -> new ArrayList<>()).add(s);
        }

        for(List<String> v : anagramGroups.values()){
            res.add(v);
        }

        return res;
    }
}
