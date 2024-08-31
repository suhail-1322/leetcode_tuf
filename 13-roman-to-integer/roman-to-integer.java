import java.util.Scanner;
import java.util.HashMap;

class Solution {
    public static int romanToInt(String s) {
        char[] r = s.toCharArray();
        HashMap<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);
        int ans = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if (m.get(r[i]) < m.get(r[i + 1])) {
                ans -= m.get(r[i]);
            } else {
                ans += m.get(r[i]);
            }
        }
        ans += m.get(r[s.length() - 1]);  
        return ans;
    }
}
