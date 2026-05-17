class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> numStore = new HashMap<>();
        int smallest = 3000;
        int largest = 0;
        int longest = 0;
        int temp = 0;
        for(int num: nums){
            numStore.put(num, 1);
            if(num < smallest){
                smallest = num;
            }
            if(num > largest){
                largest = num;
            }
        }
        for(int i = smallest; i < largest + 1; i++){
            if(numStore.get(i) != null){
                temp++;
                if(temp > longest){
                    longest = temp;
                }
            }
            else{
                temp = 0;
            }
        }
        return longest;
    }
}
