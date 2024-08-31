class Solution {
    // public List<String> letterCombinations(String digits) {
    // List<String> list = new ArrayList<>();
    // if(digits.isEmpty()){
    // return list;
    // }
    // list = findMessage(digits,"");
    // return list;
    // }

    // static List<String> findMessage(String up, String p){

    // if(up.isEmpty()){
    // List<String> list = new ArrayList<>();
    // list.add(p);
    // return list;

    // }

    // int n = up.charAt(0) - '0';
    // List<String> arr = new ArrayList<>();
    // for(int i = (n-2)*3; i<(n-1)*3;i++){
    // char c = (char) ('a'+i);
    // arr.addAll(findMessage(up.substring(1),p+c));
    // }
    // return arr;
    // }

    static String[] keys = { "","", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.isEmpty()) {
            return list;
        }
        list = message(digits, "");
        return list;
    }

    static List<String> message(String up, String p) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int n = up.charAt(0) - '0';
        List<String> a = new ArrayList<>();
        String s = keys[n];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);     
            a.addAll(message(up.substring(1),p+c));
        }
        return a;

    }
}