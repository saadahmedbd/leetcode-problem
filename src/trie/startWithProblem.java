package trie;

public class startWithProblem {
    public static void main(String[] args) {
        String[] words ={"apple",  "mango", "woman"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        String prefix ="man";
        System.out.println(startWithproblem(prefix));
    }
    public static class Node{
        Node[] children;
        boolean eow;

        Node(){
            children=new Node[26];
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            eow=false;
        }


    }
    static Node root =new Node();
    public static void insert(String words){
        Node curr =root;
        for(int i=0;i<words.length();i++){
            int idx =words.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] =new Node();
            }if(i == words.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }
    public static boolean startWithproblem(String prefix){
        Node curr =root;
        for(int i=0;i<prefix.length();i++){
            int idx =prefix.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }if(i== prefix.length()-1){
                return true;
            }
            curr=curr.children[idx];
        }
        return true;
    }
}
