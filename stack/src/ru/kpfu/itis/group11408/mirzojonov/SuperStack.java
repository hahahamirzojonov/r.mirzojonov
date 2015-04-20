package ru.kpfu.itis.group11408.mirzojonov.superStack;

public interface SuperStack<T> {
    public T pop();
    public T peek();
    public void push(T o);
    public int size();
    public boolean isEmpty();
}

