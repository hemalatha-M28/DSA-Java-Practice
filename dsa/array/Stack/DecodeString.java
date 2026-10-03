class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                countStack.push(num);
                stringStack.push(current);
                num = 0;
                current = new StringBuilder();
            } else if (ch == ']') {
                int repeatCount = countStack.pop();
                StringBuilder prev = stringStack.pop();
                for (int j = 0; j < repeatCount; j++) {
                    prev.append(current);
                }
                current = prev;
            } else {
                current.append(ch);
            }
        }

        return current.toString();
    }
}
