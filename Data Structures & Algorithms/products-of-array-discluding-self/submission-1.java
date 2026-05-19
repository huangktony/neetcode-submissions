class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int totalMulti = 1;
        int zero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                totalMulti = totalMulti * nums[i];
            }
            else{
                zero++;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(zero >= 2){
                output[i] = 0;
            }
            else if(nums[i] == 0){
                output[i] = totalMulti;
            }
            else if(zero == 1){
                output[i] = 0;
            }
            else{
                output[i] = totalMulti / nums[i];
            }
        }
        return output;
    }
}  
