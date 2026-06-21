class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        int longest = 0;

        for(int num : nums){
            numbers.add(num);
        }

        for(int number : numbers){
            int sequence = 1;
            int currentNum = number;
            if(!numbers.contains(number-1)){
                while(numbers.contains(currentNum+1)){
                    sequence++;
                    currentNum++;
                }
            }

            if(sequence > longest){
                longest = sequence;
            }
        }

        return longest;
    }
}
