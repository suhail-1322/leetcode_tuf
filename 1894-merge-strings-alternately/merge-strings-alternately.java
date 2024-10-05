class Solution {
    public static String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length(); 
        StringBuilder sb = new StringBuilder();

        int k = 0;

        int i = 0;
        int j = 0;

        while(i < n1 && j < n2){
            if(k%2 == 0){
                sb.append(word1.substring(i,i+1));
                i++;
            }
            else{
                sb.append(word2.substring(j,j+1));
                j++;
            }
            k++;
        }

        while(i < n1){
            sb.append(word1.substring(i,i+1));
            i++;
        }

        while(j < n2){
            sb.append(word2.substring(j,j+1));
            j++;
        }

        return sb.toString();
    }
}