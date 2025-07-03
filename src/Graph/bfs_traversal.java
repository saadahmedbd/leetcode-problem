package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_traversal {
    public static void main(String[] args) {
        ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        int v=5;
        System.out.println(bfs(v,adj));

    }
    public static ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> ans=new ArrayList<>();
        boolean [] visited=new boolean[v];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;
        while (!queue.isEmpty()){
            Integer node =queue.poll();
            ans.add(node);

            for(Integer it :adj.get(node)){
                if(visited[it]==false){
                    visited[it]=true;
                    queue.add(it);
                }
            }
        }
        return ans;
    }
}
