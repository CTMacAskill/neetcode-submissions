class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        for (int i=0; i < s1.length(); i++){
            if (s1.charAt(i) != s1.charAt(s1.length() - (i+1))){
                return false;
            }
        }
        return true;
    }
}
