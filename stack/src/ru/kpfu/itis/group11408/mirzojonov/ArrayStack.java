package ru.kpfu.itis.group11408.mirzojonov.superStack;

import java.util.EmptyStackException;

public class ArrayStack<T> implements SuperStack<T>  {

    private int count = 0;
    private T[] array = (T[])new Object[20];

    public T pop() {
        if(count == 0)
            throw new EmptyStackException();
        count--;
        T result = array[count];
        array[count] = null;
        return result;
    }
    public T peek() {
        if(count == 0)
            throw new EmptyStackException();
        T result = array[count - 1];
        return result;
    }
    public void push(T t) {
        if(count >= 20)
            throw new StackOverflowError("Sorry, but stack can contain only 20 elements");
        array[count] = t;
        count++;
    }
    public int size() {
        return this.count;
    }
    public boolean isEmpty() {
        return (this.count == 0);
    }
}
