package ru.kpfu.itis.group11408.mirzojonov.emailExtractor;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by World on 22.04.2015.
 */
public class EmailExtractor {
    public static void main(String[] args) {
        EmailExtractor extractor = new EmailExtractor();
        try {
            extractor.extract("emails.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void extract(String fileName) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String ptrn = "[a-z][a-z[0-9]\\u005F\\u002E\\u002D]*[a-z||0-9]";
            ptrn += "@" + ptrn + "\u002E" + "([a-z]){2,4}";
            Pattern pattern = Pattern.compile(ptrn);
            Matcher matcher;
            String line;
            while((line = reader.readLine()) != null){
                matcher = pattern.matcher(line);
                while(matcher.find()){
                    System.out.println(matcher.group());
                }
            }
        }

    }
}
