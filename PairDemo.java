// Generic Pair class
class Pair<K, V> {
    private K key;
    private V value;

    // Constructor
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    // Getters
    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    // Display method
    public void display() {
        System.out.println("Key: " + key + ", Value: " + value);
    }
}

public class PairDemo {
    public static void main(String[] args) {

        // Pair<String, Integer>
        Pair<String, Integer> agePair = new Pair<>("Age", 25);
        agePair.display();

        // Pair<String, String>
        Pair<String, String> countryPair = new Pair<>("Country", "Japan");
        countryPair.display();
    }
}
