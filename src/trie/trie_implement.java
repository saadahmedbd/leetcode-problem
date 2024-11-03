package trie;

public class trie_implement {
    public static void main(String[] args) {

    }
    public class Node {
        Node[] children; //size will be 26 english letter
        boolean eow; //end of word

        Node(){
            children =new Node[26];
            for(int i=0;i<=children.length;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
}
