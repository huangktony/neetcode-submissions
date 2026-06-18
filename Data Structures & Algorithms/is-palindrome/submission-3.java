class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            char curLeft = Character.toLowerCase(s.charAt(left));
            char curRight = Character.toLowerCase(s.charAt(right));
            if(!Character.isLetterOrDigit(curLeft)){
                left++;
            }
            else if(!Character.isLetterOrDigit(curRight)){
                right--;
            }
            else{
                if(curLeft != curRight){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
