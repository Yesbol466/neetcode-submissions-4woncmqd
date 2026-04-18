class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int firstChoosen = image[sr][sc];

        if(firstChoosen == color) return image;

        int a = image.length;
        int b = image[0].length;

        dfs(image, sr, sc, color, firstChoosen, a, b);

        return image;
    }

    public void dfs(int[][] image, int sr, int sc, 
    int color, int firstChoosen, int a, int b){

        if(sr > a - 1 || sc > b - 1 ||
        sr < 0 || sc < 0 || image[sr][sc] != firstChoosen
        ) return;

        
        image[sr][sc] = color;
        
        dfs(image,sr, sc+1, color, firstChoosen, a, b);
        dfs(image,sr, sc-1, color, firstChoosen, a, b);
        dfs(image,sr+1, sc, color, firstChoosen, a, b);
        dfs(image,sr-1 , sc, color, firstChoosen, a, b);
        }
    }

