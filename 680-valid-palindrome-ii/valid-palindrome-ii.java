class Solution {
    public boolean validPalindrome(String s) {
        
        int c = 0;

        int i = 0;
        int j = s.length()-1;

        while(i<j){

            if(s.charAt(i) != s.charAt(j)){
                return isPalin(s,i,j-1) || isPalin(s,i+1,j);
            }
            i++;
            j--;
        }

        return true;

            
    }
    static boolean isPalin(String s,int i,int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;

            }
            i++;
            j--;
        }

        return true;
    }


   
}