class Solution {

    public int shortestPathBinaryMatrix(int[][] grid) {

        if(grid[0][0] == 1) return -1;

        int n = grid.length;
        int[][] visit = new int[n][n];
        Deque<int[]> queue = new ArrayDeque<int[]>();

        queue.offer(new int[]{0,0,1});

        while(!queue.isEmpty()){
            int[] pair = queue.poll(); 

            int path = pair[2];
            if(pair[0] == n-1 && pair[1] == n-1) return path;

            int[][] neighbors = {{pair[0], pair[1] + 1}, {pair[0], pair[1] - 1}, {pair[0] + 1, pair[1]}, {pair[0] - 1, pair[1]},
                                {pair[0]-1, pair[1]-1}, {pair[0]-1, pair[1]+1}, {pair[0]+1, pair[1]-1}, {pair[0]+1, pair[1]+1}};
                        
            for(int[] m : neighbors){
                int a = m[0];
                int b = m[1];

                if(a < 0 || b < 0 ||
                a > n - 1 || b > n-1
                || grid[a][b] == 1 || visit[a][b] == 1
                ) continue;

                queue.offer(new int[]{a, b, path + 1});
                visit[a][b] = 1;
            }
        }

        return -1;
        
    }
}