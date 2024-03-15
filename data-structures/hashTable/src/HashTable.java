import java.util.LinkedList;

class KeyValuePair<K, V> {
  private K key;
  private V value;

  public KeyValuePair(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public K getKey() { return this.key; }
  public V getValue() { return this.value; }

  public void setValue(V value) { this.value = value; }
  public void setKey(K key) { this.key = key; }
}

public class HashTable<K, V> {
  private static final int DEFAULT_CAPACITY = 10;
  private static final double LOAD_FACTOR_THRESHOLD = 0.75;

  private LinkedList<KeyValuePair<K, V>>[] table;
  private int size;

  public HashTable() { this(DEFAULT_CAPACITY); }

  public HashTable(int initialCapacity) {
    table = new LinkedList[initialCapacity];
    size = 0;
  }

  public void put(K key, V value) {
    if (key == null)
      throw new IllegalArgumentException("Key cannot be null.");

    int index = hash(key);

    if (table[index] == null) {
      table[index] = new LinkedList<>();
    }

    for (KeyValuePair<K, V> pair : table[index]) {
      if (pair.getKey().equals(key)) {
        pair.setValue(value);
        return;
      }
    }

    table[index].add(new KeyValuePair<>(key, value));
    size++;

    if ((double)size / table.length > LOAD_FACTOR_THRESHOLD) {
      resize();
    }
  }

  public V get(K key) {
    if (key == null)
      throw new IllegalArgumentException("Key cannot be null.");

    int index = hash(key);
    if (table[index] != null) {
      for (KeyValuePair<K, V> pair : table[index]) {
        if (pair.getKey().equals(key)) {
          return pair.getValue();
        }
      }
    }
    return null;
  }

  private void resize() {
    LinkedList<KeyValuePair<K, V>>[] oldTable = table;
    table = new LinkedList[table.length * 2];

    for (LinkedList<KeyValuePair<K, V>> bucket : oldTable) {
      if (bucket != null) {
        for (KeyValuePair<K, V> pair : bucket) {
          put(pair.getKey(), pair.getValue());
        }
      }
    }
  }

  public int hash(K key) { return Math.abs(key.hashCode() % table.length); }
}
