package trie;

public class word_break {
    public static void main(String[] args) {
        String [] words ={"i","like", "sam", "samsung", "mobile"};
        String key ="ilikesamsung";
        for (int i=0;i<words.length;i++){
            insert(words[i]);
        }
      //  System.out.println(search("an"));
        System.out.println(wordsBreak(key));
    }
    static class Node{
        search.Node[] children;
        Boolean eow;

        Node(){
            children=new search.Node[26];
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static search.Node root =new search.Node();
    public static void insert(String words){
        search.Node curr =root;
        for(int i=0;i<words.length();i++){
            int idx =words.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] =new search.Node();
            }
            if(i == words.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }

    }
    public static boolean search (String key){
        search.Node curr =root;
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
    public static boolean wordsBreak(String key){
        if(key.length() == 0) return true;

        for(int i=1;i<=key.length();i++){
            String  firstPart =key.substring(0, i);
            String secPart =key.substring(i);
            if(search(firstPart) && wordsBreak(secPart)){
                return true;
            }
        }
        return false;
    }
}
