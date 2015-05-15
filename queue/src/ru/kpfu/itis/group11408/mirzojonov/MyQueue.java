package ru.kpfu.itis.group11408.mirzojonov.queue;

public class MyQueue<T> {
    private T[] queue = (T[])new Object[20];
    private int count = 0;

    public void enqueue(T object) throws Exception {
        if (count >= 20)
            throw new Exception("Queue is already full");
        this.queue[count++] = object;
    }
    public T dequeue(){
        if (count == 0)
            return null;
        T result = queue[0];

        for (int i = 0; i < this.count - 1; i++)
            queue[i] = queue[i + 1];

        count--;
        return result;
    }


    public T getFirst(){
        return (this.count == 0) ? null : this.queue[0];
    }


}
