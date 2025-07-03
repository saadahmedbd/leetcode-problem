package Graph;

import java.util.ArrayList;

public class dfs_traversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<5;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);
        System.out.println(dfsTraversal(5,adj));

    }
    public static ArrayList<Integer> dfsTraversal(int v, ArrayList<ArrayList<Integer>> adj){
        boolean visited[] =new boolean[v+1];
        visited[0]=true;
        ArrayList<Integer> ans =new ArrayList<>();
        dfs(0,adj,visited,ans);
        return ans;
    }
    public static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean [] visited, ArrayList<Integer> ans){
        visited[node]=true;
        ans.add(node);

        for(Integer it:adj.get(node)){
            if(visited[it] ==false){
                dfs(it,adj,visited,ans);
            }
        }
    }

}
