package ru.kpfu.itis.group11408.mirzojonov.formating;

import java.io.*;

/**
 * Created by World on 31.03.2015.
 */
public class Main {
    public static void main(String[] args){
        String result = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("in.txt"));
            String line;
            while((line = reader.readLine()) != null){
                line = line.trim();
                if(line.equals("{"))
                    result += "{";
                else result += "\n" + line;

            }
            System.out.print(result);
            reader.close();
            BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));
            writer.write(result);
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
