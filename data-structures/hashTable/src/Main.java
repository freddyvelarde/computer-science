public class Main {
  public static void main(String[] args) {
    HashTable<String, Integer> h = new HashTable<>();
    h.put("a", 100);
    h.put("b", 222);
    h.put("d", 333);
    h.put("d", 499);

    System.out.println(h.get("d"));
  }
}
