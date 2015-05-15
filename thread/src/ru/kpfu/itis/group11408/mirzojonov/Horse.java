package ru.kpfu.itis.group11408.mirzojonov.thread;

/**
 * Created by World on 25.04.2015.
 */
public class Horse implements Runnable {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            Horse horse = new Horse("Horse " + (i+1));
            Thread thread = new Thread(horse);
            thread.start();
        }
    }
    private String name;
    private int step;
    public Horse(String _name){
        this.name = _name;
        this.step = 0;
    }
    public void run(){
        for(int i=0; i<100; i++){
            step++;
            System.out.println(name + " step = " + step);
            Thread.yield();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
