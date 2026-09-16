class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        int startPointer = 0;
        int endPointer = s1.length() - 1;
        while (startPointer < endPointer){
            if (s1.charAt(startPointer) != s1.charAt(s1.length() - (startPointer+1))){
                return false;
            }
            startPointer++;
        }
        return true;
    }
}
