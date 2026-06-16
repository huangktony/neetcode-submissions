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
        int index = 0;
        String intStr = "";
        while(index < str.length()){
            if(str.charAt(index) != '#'){
                intStr = intStr + str.charAt(index);
                index++;
            }
            else {
                index++;
                newList.add(str.substring(index, index+Integer.parseInt(intStr)));
                index += Integer.parseInt(intStr);
                intStr = "";
            }
        }
        return newList;
    }
}
