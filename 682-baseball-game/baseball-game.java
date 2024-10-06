import java.util.Stack;

class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (!arr[i].equals("+") && !arr[i].equals("C") && !arr[i].equals("D")) {
                int k = Integer.parseInt(arr[i]);
                st.push(k);
            } else if (arr[i].equals("C")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else if (arr[i].equals("D")) {
                if (!st.isEmpty()) {
                    int k = st.peek() * 2;
                    st.push(k);
                }
            } else if (arr[i].equals("+")) {
                if (st.size() >= 2) {
                    int a = st.pop();
                    int b = st.peek();
                    st.push(a);
                    st.push(a + b);
                }
            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}