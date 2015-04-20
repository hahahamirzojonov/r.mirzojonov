package ru.kpfu.itis.group11408.mirzojonov.encoding_decoding;

import java.io.*;

/**
 * Created by World on 31.03.2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter("test.txt", "windows-1251");
            writer.write("Привет всем\n");
            writer.write("Какой-то текст");

            writer.close();

            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    new FileInputStream("test.txt"), "windows-1251"));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
