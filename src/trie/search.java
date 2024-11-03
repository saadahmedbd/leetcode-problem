package trie;

public class search {
    public static void main(String[] args) {
        String [] words ={"the", "there", "a", "their", "any"};
        for (int i=0;i<words.length;i++){
            insert(words[i]);
        }
        System.out.println(search("an"));
    }
    static class Node{
        Node[] children;
        Boolean eow;

        Node(){
            children=new Node[26];
            for(int i=0;i<26;i++){
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
            }
            if(i == words.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }

    }
    public static boolean search (String key){
        Node curr =root;
        for (int i=0;i<key.length();i++){
            int idx =key.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            if(i == key.length()-1 && curr.children[idx].eow==false){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
}
