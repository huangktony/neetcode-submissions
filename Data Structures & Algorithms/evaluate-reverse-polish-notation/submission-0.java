class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> operations = new ArrayDeque<>();
        String operators = "+-*/";

        for(int i = 0; i < tokens.length; i++){
            if(!operators.contains(tokens[i])){
                operations.push(Integer.valueOf(tokens[i]));
        
            } else {
                String operator = tokens[i];
                int secondNum = operations.pop();
                int firstNum = operations.pop();
                if(operator.equals("+")){
                    operations.push(firstNum + secondNum);
                } else if (operator.equals("-")){
                    operations.push(firstNum - secondNum);
                } else if (operator.equals("*")) {
                    operations.push(firstNum * secondNum);
                } else {
                    operations.push(firstNum / secondNum);
                }
            }
        }
        
        return operations.pop();
    }
}
