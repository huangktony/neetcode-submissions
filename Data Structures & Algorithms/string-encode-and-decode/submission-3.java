class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for(String str : strs){
            int size = str.length();
            encoded = encoded + size + "#" + str;
        }

        return encoded;
    }

    public List<String> decode(String str) {
        List<String> newList = new ArrayList<>();

        int i = 0;
        
        while (i < str.length()) {
            int j = i;
            
            while (str.charAt(j) != '#') {
                j++;
            }
            
            int length = Integer.parseInt(str.substring(i, j));
            
            i = j + 1;
            
            newList.add(str.substring(i, i + length));
            
            i += length;
        }
        
        return newList;
    }
}