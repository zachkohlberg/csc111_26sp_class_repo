public class KeyValueNode<K, V> {
    K key;
    V value;
    KeyValueNode<K, V> next;

    public KeyValueNode(K k, V v, KeyValueNode<K, V> n) {
        key = k;
        value = v;
        next = n;
    }
}
