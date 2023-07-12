class Pair{
    int first;
    int second;
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}
class Solution {
    public void bfs(int row, int col, boolean[][] vis, char[][] grid){
        vis[row][col] = true;
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(row, col));
        int n = grid.length;
        int m = grid[0].length;

        while(!q.isEmpty()){
            int ro = q.peek().first;
            int co = q.peek().second;
            q.remove();

            // traverse in the neighbours and mark them if it is visited
            for(int delRow = -1; delRow <= 1; delRow++ ){
                for(int delCol = -1; delCol <= 1; delCol++){
                    if((delRow==-1 && delCol==0)||(delRow==0 && delCol==1) || (delRow==1 && delCol==0) || (delRow==0 && delCol==-1)){ 
						/*Striver taught using 8 direction but here in question it has given 
						only 4 direction*/
                        int nRow = ro + delRow;
                        int nCol = co + delCol;

                        if((nRow >= 0 && nRow < n) && (nCol >= 0 && nCol < m) && (vis[nRow][nCol] == false) && 
                        (grid[nRow][nCol] == '1')){
                            vis[nRow][nCol] = true;
                            q.add(new Pair(nRow, nCol));
                        }
                    }
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        boolean[][] vis = new boolean[n][m];
        
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(!vis[row][col] && grid[row][col] == '1'){
                    cnt++;
                    bfs(row, col, vis, grid);
                }
            }
        }
        return cnt;
    }
}