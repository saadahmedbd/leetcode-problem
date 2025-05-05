package StackANDQueue;

import java.util.Stack;

public class simplipy_stack {
    public static void main(String[] args) {
        String path ="/.../a/../b/c/../d/./";
        System.out.println(simplify(path));
    }
    public static String simplify(String path){

    Stack<String> stack =new Stack<>();
    StringBuilder sb =new StringBuilder();
    String p []=path.split("/");
        for(int i=0;i<p.length;i++){
        if(!stack.isEmpty() && p[i].equals("..")){
            stack.pop();
        }else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals("..")){
            stack.push(p[i]);
        }
    }
        if(stack.isEmpty()) return "/";
        while(!stack.isEmpty()){
        sb.insert(0, stack.pop()).insert(0,"/"); //reverse the stack and add "/"
    }
        return sb.toString();
    }
}
