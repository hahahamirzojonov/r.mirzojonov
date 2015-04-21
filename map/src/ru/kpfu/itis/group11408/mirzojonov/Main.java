package ru.kpfu.itis.group11408.mirzojonov.map;


/**
 * Created by World on 28.03.2015.
 */
public class Main {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<Integer, String>(10);
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        System.out.println(map.size());

    }
}
