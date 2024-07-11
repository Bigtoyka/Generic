public class Box<K, V, T> {

    private K key;
    private V value;
    private T value2;

    public T getValue2() {
        return value2;
    }

    public void setValue2(T value2) {
        this.value2 = value2;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Box(K key, V value, T value2) {
        this.key = key;
        this.value = value;
        this.value2 = value2;
    }
}
