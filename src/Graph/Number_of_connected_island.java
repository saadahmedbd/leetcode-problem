package Graph;

import java.util.LinkedList;
import java.util.Queue;

class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first=first;
        this.second=second;
    }
}
public class Number_of_connected_island {
    public static void main(String[] args) {

    }
    public int connected_island(char[][] grid) { // grid representation of water anf land
        int n=grid.length; //number of row
        int m=grid[0].length; //number column
        int vis[][]=new int[n][m] ; // 2D visited array similar to grid size
        int count =0; //store number of island

        for(int row=0;row<n;row++){
            for(int col =0;col<m;col++){
                if(vis[row][col] == 0 && grid[row][col] == '1') { // row and col are not visited also grid are island
                    vis[row][col]=1;
                    count++;
                    dfs(row,col,vis,grid);

                }
            }
        }
        return count;
    }
    public void dfs(int row,int col, int[][] vis, char [][] grid){
        vis[row][col]=1; //mark that visited
        Queue<pair> queue=new LinkedList<pair>();
        queue.add(new pair(row,col)); //add row and col in queue
        int n=grid.length;
        int m=grid[0].length;

        while(!queue.isEmpty()){
            int ro=queue.peek().first;
            int co =queue.peek().second;
            queue.remove();
            //trAVERSE In the neighbour add mark that as visited
            for(int delRow=-1;delRow<=1;delRow++){
                for(int delCol=-1;delCol<=1;delCol++){
                    int nRow=row+delRow;
                    int nCol=col+delCol;
                    if(nRow >=0 && nRow < n && nCol >=0 && nCol < m
                            && grid[nRow][nCol]== '1' && vis[nRow][nCol] ==0){
                        vis[nRow][nCol]=1;
                        queue.add(new pair(nRow, nCol));
                    }
                }
            }
        }

    }
}
