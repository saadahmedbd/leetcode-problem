package trie;


public class longest_Word {
    public static void main(String[] args) {
        String[] words ={"a", "banana", "app", "appl", "ap","apply","apple"};
        for (int i=0;i<words.length;i++){
            insert(words[i]);
        }
        longestWords(root, new StringBuilder(""));
        System.out.println(ans);
    }
    static class Node{
        Node[] children;
        boolean eow;

        Node (){
            children =new Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static Node root =new Node();
    public static void  insert(String words){
        Node curr =root;
        for(int i=0;i<words.length();i++){
            int idx =words.charAt(i)-'a';
            if(curr.children[idx] ==null){
                curr.children[idx]=new Node();
            }
            if(i== words.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }
    public static String ans ="";

    public static void longestWords(Node root, StringBuilder temp){
        if(root==null) return;

        for(int i=0;i<26;i++){
            if(root.children[i] != null && root.children[i].eow == true){
                temp.append((char)(i+'a'));// char cast i+'a" means =b
                if(temp.length() >ans.length()){
                    ans =temp.toString();
                }
                longestWords(root.children[i], temp);
                temp.deleteCharAt(temp.length()-1);//backtrack
            }
        }
    }
}
