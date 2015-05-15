package ru.kpfu.itis.group11408.mirzojonov.queue;

/**
 * Created by World on 31.03.2015.
 */
public class Main {
    public static void main(String[] args) {
        MyQueue<String> texts = new MyQueue<>();
        try {
            texts.enqueue("Hello");
            texts.enqueue("world!");
            texts.enqueue("From");
            texts.enqueue("ITIS!");
            String text;
            while((text = texts.dequeue()) != null){
                System.out.print(text + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
