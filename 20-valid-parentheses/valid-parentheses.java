import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
                stack.push(arr[i]);
            } 
            else if (arr[i] == ')' || arr[i] == ']' || arr[i] == '}') 
            {

                if (stack.isEmpty()) {
                    return false;
                }
                char b = stack.pop();

                if ((b == '(' && arr[i] != ')') ||
                    (b == '[' && arr[i] != ']') ||
                    (b == '{' && arr[i] != '}')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
