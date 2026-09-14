class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                stack.push(i);
            } else if (chars[i] == ')') {
                if (stack.isEmpty()) {
                    chars[i] = '#';
                } else {
                    stack.pop();
                }
            }
        }
        while(!stack.isEmpty()){
            chars[stack.peek()]='#';
            stack.pop();
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '#') {
                ans.append(chars[i]);
            }
        }
        return ans.toString();
    }
}