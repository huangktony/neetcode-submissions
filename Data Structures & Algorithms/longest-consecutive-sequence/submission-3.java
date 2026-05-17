class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numStore = new HashSet<>();
        int longest = 0;
        for(int num : nums){
            numStore.add(num);
        }
        for(int num : numStore){
            if(!numStore.contains(num - 1)){
                int tempNum = num;
                int temp = 1;
                while(numStore.contains(tempNum + 1)){
                    temp++;
                    tempNum++;
                }
                longest = Math.max(longest, temp);
            }
        }
        return longest;
    }
}
