public class BFSExample {
        public static void main(String[] args) {
            // Create a graph with 7 vertices
            Graph graph = new Graph(7);

            // Add edges to the graph
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 3);
            graph.addEdge(2, 4);
            graph.addEdge(2, 5);
            graph.addEdge(3, 6);

            System.out.println("Breadth-First Traversal (starting from node 0):");
            graph.BFS(0);
        }
    }
