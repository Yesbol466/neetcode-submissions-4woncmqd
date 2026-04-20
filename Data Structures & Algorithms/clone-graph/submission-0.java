/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {

        if(node == null) return null;

        HashMap<Node, Node> visit = new HashMap<Node, Node>();

        return dfs(node, visit);
    }

    public Node dfs(Node original, HashMap<Node, Node> visit) {
        if(visit.containsKey(original)) return visit.get(original);

        Node copy = new Node(original.val);
        visit.put(original, copy);

        for(Node neighbor : original.neighbors){
            copy.neighbors.add(dfs(neighbor, visit));
        }

        return copy;
    }
}