package lab11.task1;

import java.util.*;

public class MultiMapValue<K, V> {
    private HashMap<K, ArrayList<V>> multiMap = new HashMap<>();

    public HashMap<K, ArrayList<V>> getMultiMap() {
        return multiMap;
    }

    public void add(K key, V value) {
       if (multiMap.get(key) == null) {
           multiMap.put(key, new ArrayList<>());
       }
       multiMap.get(key).add(value);
    }

    public void addAll(K key, List<V> values) {
        if(multiMap.get(key) == null) {
            multiMap.put(key, new ArrayList<>(values));
        }
    }

    public void addAll(MultiMapValue<K, V> map) {
        HashMap<K, ArrayList<V>> tempMap = new HashMap<>(map.getMultiMap());
        multiMap.putAll(tempMap);
    }

    public V getFirst(K key) {
        return multiMap.get(key).get(0);
    }

    public List<V> getValues(K key) {
        return multiMap.get(key);
    }

    public boolean containsKey(K key) {
        return multiMap.containsKey(key);
    }

    public boolean isEmpty() {
        return multiMap.isEmpty();
    }

    public List<V> remove(K key) {
        return multiMap.remove(key);
    }

    public int size() {
        return multiMap.size();
    }
}
