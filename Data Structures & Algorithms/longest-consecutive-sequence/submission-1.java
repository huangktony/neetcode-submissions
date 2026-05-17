class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numStore = new HashSet<>();
        int longest = 0;
        int temp = 0;
        for(int num : nums){
            numStore.add(num);
        }
        for(int num : numStore){
            if(!numStore.contains(num - 1)){
                int tempNum = num;
                while(numStore.contains(num++)){
                    temp++;
                    if(temp > longest){
                        longest = temp;
                    }
                    tempNum++;
                }
                temp = 0;
            }
        }
        return longest;
    }
}
