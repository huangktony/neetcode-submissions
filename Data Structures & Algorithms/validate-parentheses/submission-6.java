class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        String open = "({[";
        
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            
            if (open.indexOf(curr) != -1) {
                stack.push(curr);
            } 
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char removed = stack.pop();
                if (curr == '}' && removed != '{') {
                    return false;
                }
                else if (curr == ')' && removed != '(') {
                    return false;
                }
                else if (curr == ']' && removed != '[') {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}