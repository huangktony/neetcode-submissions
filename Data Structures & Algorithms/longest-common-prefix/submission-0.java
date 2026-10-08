class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";

        for(String str : strs){
            if(res.length() < str.length()){
                res = str;
            }
        }

        for(String str : strs){
            while(!str.startsWith(res)){
                res = res.substring(0, res.length()-1);
            }
        }


        return res;
    }
}