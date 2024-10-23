import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> parens = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                parens.push(ch); // Push opening brackets onto the stack
            } else if (ch == ')' || ch == ']' || ch == '}') {
                // If there's no corresponding opening bracket
                if (parens.isEmpty()) {
                    return false;
                }
                char open = parens.pop();
                // Check if the brackets match
                if (!(open == '(' && ch == ')'
                        || open == '[' && ch == ']'
                        || open == '{' && ch == '}')) {
                    return false;
                }
            }
        }

        // If the stack is empty, all brackets were balanced
        return parens.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "{[()]}";  // Test input

        if (solution.isValid(input)) {
            System.out.println("Balanced.");
        } else {
            System.out.println("Not balanced.");
        }
    }
}
