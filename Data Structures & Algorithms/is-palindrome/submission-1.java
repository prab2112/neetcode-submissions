class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i=s.length()-1,j=0 ; j < i ; i--,j++){
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
        
    }
}
