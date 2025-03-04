public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String curr: tokens) {
            if (curr.equals("+")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(a + b + "");
            } else if (curr.equals("-")) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                stack.push(a - b + "");
            } else if (curr.equals("*")) {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                stack.push(a * b + "");
            } else if (curr.equals("/")) {
                int b = Integer.parseInt(stack.pop());
                int a = Integer.parseInt(stack.pop());
                stack.push(a / b + "");
            } else {
                stack.push(curr);
            }
        }
        return Integer.parseInt(stack.peek());
    }
