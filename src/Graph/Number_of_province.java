package Graph;

public class Number_of_province {
    public static void main(String[] args) {

    }
    public void dfs(int node, int[][] isConnected, boolean[] visited){
        visited[node]=true;
        for(int neighbour =0;neighbour < visited.length;neighbour++){
            if(isConnected[node][neighbour]==1 && !visited[neighbour]){
                dfs(neighbour,isConnected,visited);
            }
        }

    }
    public int province(int[][] isConnected){
        boolean[] visited=new boolean[isConnected.length];
        int count=0;
        for(int node=0;node<visited.length;node++){
            if(!visited[node]){
                count++;
                dfs(0,isConnected,visited);
            }
        }
        return count;

    }
}
