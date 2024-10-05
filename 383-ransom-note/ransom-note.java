class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int n = ransomNote.length();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0 ;i<magazine.length();i++){
            char c = magazine.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }


        for(int i = 0;i<ransomNote.length();i++){
            char c = ransomNote.charAt(i);
            if(map.containsKey(c) && map.get(c) > 0){
                int k = map.get(c)-1;
                map.put(c,k);  
                n--; 
            }
            else return false;
        }
        return n==0;
    }
}