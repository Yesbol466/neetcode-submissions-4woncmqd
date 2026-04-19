class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] directions = {{1,0}, {0,1}, {-1,0}, {0,-1}};

        Deque<int[]> queue = new ArrayDeque<int[]>();

        int minute = 0;
        int fresh = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if (grid[i][j] == 1) {
                    fresh++;
                }
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i, j});
                }
            }
        }

        while(!queue.isEmpty() && fresh > 0){
            int l = queue.size();
            for(int i = 0; i<l; i++){
                int[] pair = queue.poll();
                int a = pair[0];
                int b = pair[1];

                for(int[] d : directions){
                    int row = a + d[0];
                    int column = b + d[1];

                    if(row < 0 || column < 0 || row > n-1 || column > m-1 
                    || grid[row][column] != 1) continue;

                    queue.offer(new int[]{row,column});
                    grid[row][column] = 2;
                    fresh--;
                }
            }
            minute++;        
        }
        return fresh == 0 ? minute : -1;
        
    }
}
