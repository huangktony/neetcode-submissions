class Solution {
    public boolean isValid(String s) {
        Deque<Character> string = new ArrayDeque<>();
        String openers = "[{(";
        for(int i = 0; i < s.length(); i++){
            if(string.isEmpty() || openers.contains("" + s.charAt(i))){
                string.push(s.charAt(i));
            }
            else if(s.charAt(i) == ']'){
                if(string.pop() != '['){
                    return false;
                }
            }
            else if(s.charAt(i) == '}'){
                if(string.pop() != '{'){
                    return false;
                }
            }
            else if(s.charAt(i) == ')'){
                if (string.pop() != '('){
                    return false;
                }
            }
        }
        return string.isEmpty();
    }
}
