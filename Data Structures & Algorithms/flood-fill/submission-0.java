class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int firstChoosen = image[sr][sc];

        int[][] checkIfVisited = new int[image.length][image[0].length];

        dfs(image, sr, sc, color, firstChoosen, checkIfVisited);

        return image;
    }

    public void dfs(int[][] image, int sr, int sc, 
    int color, int firstChoosen, int[][] checkIfVisited){

        if(sr > image.length - 1 || sc > image[0].length - 1 ||
        sr < 0 || sc < 0 || 
        checkIfVisited[sr][sc] == 1
        ) return;

        if(image[sr][sc] == firstChoosen){
            image[sr][sc] = color;

            checkIfVisited[sr][sc] = 1;

            dfs(image,sr, sc+1, color, firstChoosen, checkIfVisited);
            dfs(image,sr, sc-1, color, firstChoosen, checkIfVisited);
            dfs(image,sr+1, sc, color, firstChoosen, checkIfVisited);
            dfs(image,sr-1 , sc, color, firstChoosen, checkIfVisited);
        }

    }

}