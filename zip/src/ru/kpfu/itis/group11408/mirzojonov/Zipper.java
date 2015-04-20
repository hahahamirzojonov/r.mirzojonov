package ru.kpfu.itis.group11408.mirzojonov.zip;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Created by World on 21.04.2015.
 */
public class Zipper {
    public void unzip(String zipName){
        try(ZipInputStream inputStream = new ZipInputStream(new FileInputStream(zipName))){

            ZipEntry entry = null;
            while((entry = inputStream.getNextEntry()) != null){
                System.out.println(entry.getName());
                try(FileOutputStream outputStream = new FileOutputStream(entry.getName())) {
                    int data = 0;
                    while ((data = inputStream.read()) != -1){
                        outputStream.write(data);
                    }
                }

            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void zip(String zipName, String... fileNames){
        try (ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(zipName))) {
            for(String file : fileNames) {
                FileInputStream inputStream = new FileInputStream(file);

                outputStream.putNextEntry(new ZipEntry(file));
                int data = 0;
                while ((data = inputStream.read()) != -1) {
                    outputStream.write(data);
                }

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
