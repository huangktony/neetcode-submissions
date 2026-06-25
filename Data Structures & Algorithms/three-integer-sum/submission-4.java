class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> tripleList = new ArrayList<>();
        Arrays.sort(nums);
        int numsSize = nums.length;
        for(int i = 0; i < numsSize - 2; i++){
            int target = -nums[i];
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = numsSize - 1;
            while(left < right){
                if(nums[left] + nums[right] == target){
                    List<Integer> triple = new ArrayList<>();
                    triple.add(nums[i]);     
                    triple.add(nums[left]);
                    triple.add(nums[right]);
                    tripleList.add(triple);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left-1]) left++;
                    while (left < right && nums[right] == nums[right+1]) right--;
                }
                else if(nums[left] + nums[right] < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return tripleList;
    }
}