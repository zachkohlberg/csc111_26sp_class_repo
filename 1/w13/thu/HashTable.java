public class HashTable<K, V> {
    private KeyValueNode<K, V>[] data;
    private Hash<K> hashFunction;

    // TODO: constructor parameters
    // - size
    // - hash function
    @SuppressWarnings("unchecked")
    public HashTable(..., int size) {
        // TODO: init hashFunction
        // create an array of the appropriate size
        data = new KeyValueNode[size];
    }

    public V get(K key) {
        // TODO: call getKV to get the right node
        // if node isn't null, return node.value
        // else return null
    }

    public void set(K key, V value) {
        // TODO: call getKV to get the right node
        // if node isn't null, set node.value to value
        // else set data[i] = new node(key, value, data[i])
    }

    private KeyValueNode<K, V> getKV(K key) {
        // TODO: hash the key, hashFunction.hash(key)
        // TODO: modulo by data.length to convert hash to index
        // TODO: linear search of list starting at data[i]

        // outline for linear search
        //
        // n = data[i]
        // while (n isn't null)
        //     if (n.key == key)
        //         match found (return)
        //     n = n.next
        // match not found (return)
    }
}
