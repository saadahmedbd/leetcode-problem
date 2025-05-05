package StackANDQueue;

import java.util.Stack;

public class BaseBall_game {
    public static void main(String[] args) {
        String [] operation ={"5","-2","4","C","D","9","+","+"};
        System.out.println(baseball_game(operation));
    }
    public static int baseball_game(String operation[]){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operation.length; i++) {
            if (isInteger(operation[i])) {
                stack.push(Integer.valueOf(operation[i]));
            } else if (operation[i].equals("C")) {
                stack.pop();
            } else if (operation[i].equals("D")) {
                int val = stack.peek();
                stack.push(val * 2);
            } else if (operation[i].equals("+")) {
                int top = stack.pop();
                int secondTop = stack.peek();
                stack.push(top); // restore
                stack.push(top + secondTop);
            }
        }

        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }

        return sum;
    }
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // Check if the string is a single character (a-z, A-Z)

}
