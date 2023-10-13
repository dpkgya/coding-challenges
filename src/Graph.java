import java.util.LinkedList;
import java.util.Queue;

class Graph {
    private int V; // Number of vertices
    private LinkedList<Integer>[] adjacencyList;

    // Constructor
    Graph(int v) {
        V = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Add an edge to the graph
    void addEdge(int v, int w) {
        adjacencyList[v].add(w);
    }

    // Perform BFS traversal starting from a given source node
    void BFS(int startNode) {
        // Initialize visited array to keep track of visited nodes
        boolean[] visited = new boolean[V];

        // Create a queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Mark the source node as visited and enqueue it
        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            // Dequeue a vertex from the queue
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            // Get all adjacent vertices of the dequeued vertex
            for (Integer neighbor : adjacencyList[currentNode]) {
                if (!visited[neighbor]) {
                    // Mark the adjacent node as visited and enqueue it
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}