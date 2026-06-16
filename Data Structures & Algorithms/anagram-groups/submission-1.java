class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Build frequency map for this string
            HashMap<Character, Integer> freq = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                freq.put(c, freq.getOrDefault(c, 0) + 1);
            }
            
            // Convert frequency map to a deterministic string key
            String key = new TreeMap<>(freq).toString();
            
            // Add this string to the bucket for this key
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}