class Solution {
    boolean isPalindrome(String s) {
        // code here
        String str = s;
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            return true;
        } else {
            return false;
        }
    }    
}