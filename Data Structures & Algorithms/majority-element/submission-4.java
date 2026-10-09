class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hM = new HashMap<>();
        int res = nums[0];


        for(int num : nums){
            hM.put(num, hM.getOrDefault(num, 0) + 1);

            if(hM.get(res) < hM.get(num)){
                res = num;
            }
        }


        return res;
    }
}