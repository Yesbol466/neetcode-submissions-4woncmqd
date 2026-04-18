class Solution {

    int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int a = grid.length; 
        int b = grid[0].length;
        int max = 0;

        for(int i = 0; i<a; i++){
            for(int y = 0; y<b; y++){
                if(grid[i][y] == 1){
                    int a1 = dfs(grid, i, y);
                    max = a1 > max ? a1 : max;
                }
            }
        }

        return max;
    }

    public int dfs(int[][] grid, int i, int y){
            int a = grid.length; 
            int b = grid[0].length;

            if(i > a - 1 || y > b - 1 
            || i < 0 || y < 0
            || grid[i][y] == 0) return 0;

            int count = 1;
            
            grid[i][y] = 0;

            for(int[] dir : directions){
                count += dfs(grid, i + dir[0], y + dir[1]);
            }

            return count;
        }
    }

