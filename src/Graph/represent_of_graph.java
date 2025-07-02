package Graph;

import java.util.ArrayList;

class represent_of_graph{
    public static void main(String[] arg){
        ArrayList<ArrayList<Integer>> adj =new ArrayList<ArrayList<Integer>>();
        int n=3,m=3;
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);

        adj.get(2).add(3);
        adj.get(3).add(2);

        adj.get(1).add(3);
        adj.get(3).add(1);
        System.out.println(adj);
    }
}