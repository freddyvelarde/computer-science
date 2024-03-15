import java.util.*;

public class Graph<T> {
  private Map<T, LinkedList<T>> adj;

  Graph() { this.adj = new HashMap<>(); }

  public void addVertex(T vertex) { adj.put(vertex, new LinkedList<>()); }

  public void addEdge(T source, T destination) {
    addEdge(source, destination, false);
  }

  public void addEdge(T source, T destination, boolean connected) {
    if (!adj.containsKey(source)) {
      addVertex(source);
    }
    if (!adj.containsKey(destination)) {
      addVertex(destination);
    }
    if (connected) {
      adj.get(destination).add(source);
    }

    adj.get(source).add(destination);
  }

  public int findShortedPath(T source, T target) {
    Queue<T> queue = new LinkedList<>();
    Map<T, Boolean> visited = new HashMap<>();

    for (T v : adj.keySet()) {
      visited.put(v, false);
    }

    queue.add(source);
    visited.put(source, true);
    int stepsCounter = 0;

    while (!queue.isEmpty()) {
      T currentVertex = queue.poll();

      /* System.out.println(currentVertex); */

      if (adj.get(currentVertex) != null) {
        for (T v : adj.get(currentVertex)) {
          if (!visited.get(v)) {
            if (v == target) {
              return stepsCounter;
            }
            queue.add(v);
            visited.put(v, true);
          }
        }
      }
      stepsCounter++;
    }
    return 0;
  }

  public void printGraph() {
    for (Map.Entry<T, LinkedList<T>> entry : adj.entrySet()) {
      System.out.print(entry.getKey() + " -> ");

      for (T neightbor : entry.getValue()) {
        System.out.print(neightbor + " ");
      }
      System.out.println();
    }
  }
}
