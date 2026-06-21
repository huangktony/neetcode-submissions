class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;

        while(left < right){
            int leftNum = numbers[left];
            int rightNum = numbers[right];
            int sum = leftNum + rightNum;
            if(sum == target){
                return new int[] {left+1, right+1};
            }
            else{
                if(sum > target){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return new int[] {left+1, right+1};
    }
}
