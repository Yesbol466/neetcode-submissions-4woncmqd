class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();
        
        for (int i = 0; i < numCourses; i++) {
            adjList.put(i, new ArrayList<>());
        }

        for(int i = 0; i<prerequisites.length; i++){
            adjList.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int[] visited = new int[numCourses];

        for(int course = 0; course<numCourses; course++){
            if(hasCycle(course, adjList, visited)){
                return false;
            }
        }

        return true;
    }

    public boolean hasCycle(int course, HashMap<Integer, List<Integer>> adjList, int[] visited){
        if (visited[course] == 1) {
            return true;
        }
        
        if (visited[course] == 2) {
            return false;
        }

        visited[course] = 1;

        for(int pre : adjList.get(course)){
            if(hasCycle(pre, adjList, visited)){
                return true;
            }
        }

        visited[course] = 2;
        return false;
    }
}
