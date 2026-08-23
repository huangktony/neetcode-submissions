class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for(int num : nums){
            if(!numSet.add(num)){
                return num;
            }
        }
        
        return 0;
    }
}
