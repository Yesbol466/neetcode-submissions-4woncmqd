class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int a = grid.length;
        int b = grid[0].length;
        
        for(int i = 0; i<a; i++){
            for(int x = 0; x<b; x++){
                if(grid[i][x] == '1'){
                    dfs(grid, i, x);
                    count++;
                }
            }
        }

        return count;
        
    }

    public void dfs(char[][] grid, int a1, int b1){
        int a = grid.length;
        int b = grid[0].length;

        if(a1 > a - 1 || b1 > b - 1 ||  a1 < 0 || b1 < 0
        || grid[a1][b1] == '0') return;

        grid[a1][b1] = '0';

        dfs(grid, a1 + 1, b1);
        dfs(grid, a1 - 1, b1);
        dfs(grid, a1, b1 + 1);
        dfs(grid, a1, b1 - 1);
    }

}
