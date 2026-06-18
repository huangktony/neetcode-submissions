
class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append('#').append(str);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> newList = new ArrayList<>();
        int i = 0;
        int len = str.length();
        
        while (i < len) {
            int length = 0;
            while (str.charAt(i) != '#') {
                length = length * 10 + (str.charAt(i) - '0');
                i++;
            }
            
            i++; 
            
            newList.add(str.substring(i, i + length));
            
            i += length;
        }
        return newList;
    }
}