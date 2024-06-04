import java.util.*;

public class WeightedGraph<T> {
  private Map<T, LinkedList<Edge>> adj;

  public WeightedGraph() { this.adj = new HashMap<>(); }

  public void addVertex(T vertex) { adj.put(vertex, new LinkedList<>()); }

  public void addEdge(T source, T destination, int weight) {
    if (!adj.containsKey(source)) {
      addVertex(source);
    }
    if (!adj.containsKey(destination)) {
      addVertex(destination);
    }
    adj.get(source).add(new Edge(destination, weight));
  }

  public void addEdge(T source, T destination, int weight,
                      boolean bidirectional) {
    addEdge(source, destination, weight);
    if (bidirectional) {
      addEdge(destination, source, weight);
    }
  }

  public void dfs(T source) {
    Stack<T> stack = new Stack<>();
    Map<T, Boolean> visited = new HashMap<>();

    for (T v : adj.keySet()) {
      visited.put(v, false);
    }

    stack.push(source);
    visited.put(source, true);

    while (!stack.isEmpty()) {
      T currentVertex = stack.pop();
      System.out.println(currentVertex);

      if (adj.get(currentVertex) != null) {
        for (Edge edge : adj.get(currentVertex)) {
          T neighbor = edge.destination;
          if (!visited.get(neighbor)) {
            stack.push(neighbor);
            visited.put(neighbor, true);
          }
        }
      }
    }
  }

  public void bfs(T source) {
    Queue<T> queue = new LinkedList<>();
    Map<T, Boolean> visited = new HashMap<>();

    for (T v : adj.keySet()) {
      visited.put(v, false);
    }

    queue.add(source);
    visited.put(source, true);

    while (!queue.isEmpty()) {
      T currentVertex = queue.poll();
      System.out.println(currentVertex);

      if (adj.get(currentVertex) != null) {
        for (Edge edge : adj.get(currentVertex)) {
          T neighbor = edge.destination;
          if (!visited.get(neighbor)) {
            queue.add(neighbor);
            visited.put(neighbor, true);
          }
        }
      }
    }
  }

  public void printGraph() {
    for (Map.Entry<T, LinkedList<Edge>> entry : adj.entrySet()) {
      System.out.print(entry.getKey() + " -> ");

      for (Edge edge : entry.getValue()) {
        System.out.print(edge.destination + "(" + edge.weight + ") ");
      }
      System.out.println();
    }
  }

  private class Edge {
    T destination;
    int weight;

    Edge(T destination, int weight) {
      this.destination = destination;
      this.weight = weight;
    }
  }

  public static void main(String[] args) {
    WeightedGraph<String> graph = new WeightedGraph<>();
    graph.addVertex("A");
    graph.addVertex("B");
    graph.addVertex("C");
    graph.addEdge("A", "B", 5);
    graph.addEdge("B", "C", 3, true);
    graph.addEdge("A", "C", 10);

    graph.printGraph();

    System.out.println("DFS:");
    graph.dfs("A");

    System.out.println("BFS:");
    graph.bfs("A");
  }
}
