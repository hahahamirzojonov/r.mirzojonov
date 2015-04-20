package ru.kpfu.itis.group11408.mirzojonov.zip;

/**
 * Created by World on 21.04.2015.
 */
public class Main {
    public static void main(String[] args) {
        Zipper zip = new Zipper();
        zip.zip("archieve.zip", "README.md", "test.txt");

        zip.unzip("archieve.zip");
    }

}
