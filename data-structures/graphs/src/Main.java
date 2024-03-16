public class Main {
  public static void main(String[] args) {
    Graph<String> g = new Graph<>();

    g.addVertex("car");
    g.addVertex("cab");
    g.addVertex("cat");
    g.addVertex("bat");
    g.addVertex("bar");
    g.addVertex("mat");

    g.addEdge("cab", "car");
    g.addEdge("cab", "cat");
    g.addEdge("car", "cat");
    g.addEdge("car", "bar");
    g.addEdge("cat", "mat");
    g.addEdge("cat", "bat");
    g.addEdge("mat", "bat");
    g.addEdge("bar", "bat");

    /* g.printGraph(); */
    g.bfs("car");
    // System.out.println(g.findShortedPath("cab", "bat"));
  }
}
