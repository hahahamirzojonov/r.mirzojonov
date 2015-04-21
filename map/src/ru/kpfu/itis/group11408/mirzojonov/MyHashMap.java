package ru.kpfu.itis.group11408.mirzojonov.map;

import java.util.*;

/**
 * Created by World on 31.03.2015.
 */
public class MyHashMap<K, V> implements Map<K, V> {
    private List<MapItem> list;
    private int count = 0;
    MyHashMap(int size){
        this.list = new ArrayList<MapItem>(size);

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public boolean containsKey(Object key) {
        for(MapItem mi : list){
            if(mi.getKey().equals(key))
                return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for(MapItem mi : list){
            if(mi.getValue().equals(value))
                return true;
        }
        return false;
    }

    @Override
    public V get(Object key) {
        for(MapItem mi : list){
            if(mi.getKey().equals(key))
                return (V)mi.getValue();
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        MapItem mi = new MapItem(key, value);
        list.add(mi);
        count++;
        return (V)mi.getValue();
    }

    @Override
    public V remove(Object key) {
        for(MapItem mi : list){
            if(mi.getKey().equals(key)){
                list.remove(mi);
                count--;
                return (V)mi.getValue();
            }

        }
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {
        count=0;
        list.clear();
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    private class MapItem<K, V> implements Entry<K, V>{
        private K key;
        private V value;
        public MapItem(K key, V value){
            this.key = key;
            this.value = value;
        }
        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            this.value = value;
            return this.value;
        }
    }
}
