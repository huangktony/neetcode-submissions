class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] pair = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(map.containsKey(diff)){
                pair[0] = map.get(diff);
                pair[1] = i;
                return pair;
            } 
            map.put(nums[i], i);
        }

        return pair;
    }
}
