class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            String ch = tokens[i];
            if (ch.equals("+") || ch.equals("-") ||
                    ch.equals("*") || ch.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                if (ch.equals("+")) {
                    stack.push(num2 + num1);
                } else if (ch.equals("-")) {
                    stack.push(num2 - num1);
                } else if (ch.equals("*")) {
                    stack.push(num2 * num1);
                } else {
                    stack.push(num2 / num1);
                }
            } else {
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.peek();
    }
}