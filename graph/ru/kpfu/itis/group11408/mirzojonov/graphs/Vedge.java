package ru.kpfu.itis.group11408.mirzojonov.graphs;

/**
 * Created by World on 18.04.2015.
 */
public class Vedge<T> {
    private T value;
    public Vedge(T _value){
        this.value = _value;
    }
    public T getValue(){return value;}
}
