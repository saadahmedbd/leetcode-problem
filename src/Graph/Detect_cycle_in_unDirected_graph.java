package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class Detect_cycle_in_unDirected_graph {
    public static void main(String[] args) {

    }
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj){
        boolean [] visited= new boolean[v];
        for(int i=0;i<v;i++)
            if(visited[i]==false){
                if(cycleCheck(v,i,adj,visited)){
                    return true;
                }
            }
        return false;
    }
    //bfs taverse for detect cycle
    public boolean cycleCheck(int v, int src, ArrayList<ArrayList<Integer>> adj, boolean[] visited){
        visited[src]=true;
        Queue<pair>q=new LinkedList<pair>();
        q.add(new pair(src,-1));
        while (!q.isEmpty()){
            int node=q.peek().first;
            int parent=q.peek().second;

            for(int adjacencyList : adj.get(node)){
                if(visited[adjacencyList] == false){
                    visited[adjacencyList]=true;
                    q.add(new pair(adjacencyList, node));
                }else if(parent != adjacencyList){  //if parents is the current node then return false
                    return true;
                }
            }
        }
        return false;
    }
}
