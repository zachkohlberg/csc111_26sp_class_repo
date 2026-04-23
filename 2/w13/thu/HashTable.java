public class HashTable<K, V> {
    private Hash<K> hashFunction;
    private KeyValueNode<K, V>[] data;

    // TODO: parameters
    // - hash function (Hash<K>)
    // - size (int)
    @SuppressWarnings("unchecked")
    public HashTable(..., int size) {
        // TODO: store hash function in instance variable
        data = new KeyValueNode[size];
    }

    public V get(K key) {
        // TODO: get kv node
        // if node isn't null, return node.value
        // else return null
    }

    public void set(K key, V value) {
        // TODO: get kv node
        // if node isn't null, set node.value to value
        // else set data[i] = new node(key, value, data[i])
    }

    private KeyValueNode<K, V> getKVNode(K key) {
        // TODO: hash and modulo by array length
        // TODO: linear search the slot for a matching kv node
        //
        // pseudocode
        //
        // n = data[i]
        // while n isn't null
        //     if n.key equals key
        //         return n (match found)
        //     n = n.next
        // return null (match not found)
    }
}
