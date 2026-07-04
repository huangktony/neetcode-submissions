class Solution {
    public boolean isValid(String s) {
        List<Character> str = new ArrayList<>();
        String open = "({[";
        for(int i = 0; i < s.length(); i++){
            if(open.indexOf(s.charAt(i)) != -1){
                str.add(s.charAt(i));
            }
            else{
                if(str.isEmpty()){
                    return false;
                }
                char curr = s.charAt(i);
                char removed = str.remove(str.size()-1);
                if(curr == '}' && removed != '{'){
                    return false;
                }
                else if(curr == ')' && removed != '('){
                    return false;
                }
                else if(curr == ']' && removed != '['){
                    return false;
                }
            }
        }
        return str.isEmpty();
    }
}
