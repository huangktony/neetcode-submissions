class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> record = new Stack<>();
        int score = 0;
        for(String op : operations){
            if(op.equals("C")){
                score -= record.pop();
            }
            else if(op.equals("+")){
                int temp = record.pop();
                int temp2 = record.peek() + temp;
                record.push(temp);
                score += record.push(temp2);
            }
            else if(op.equals("D")){
                score += record.push(2 * record.peek());

            }
            else{
                score += record.push(Integer.parseInt(op));
            }
        }
        return score;
    }
}