class Solution {
    HashMap<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();
    HashSet<Integer> visiting = new HashSet<Integer>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {        
        for (int i = 0; i < numCourses; i++) {
            adjList.put(i, new ArrayList<>());
        }

        for(int i = 0; i<prerequisites.length; i++){
            adjList.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        for(int c = 0; c<numCourses; c++){
            if(dfs(c)){
                return false;
            }
        }

        return true;
    }

    public boolean dfs(int c){
        if(visiting.contains(c)) return true;

        if(adjList.get(c).isEmpty()) return false;

        visiting.add(c);

        for(int g : adjList.get(c)){
            if(dfs(g)){
                return true;
            }
        }

        visiting.remove(c);
        adjList.put(c, new ArrayList<Integer>());

        return false;
    }
}
