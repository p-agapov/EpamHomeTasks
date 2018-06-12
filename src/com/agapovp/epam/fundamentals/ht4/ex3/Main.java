package com.agapovp.epam.fundamentals.ht4.ex3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

public class Main {
    private final static String inputFileName = "src/com/agapovp/epam/fundamentals/ht4/ex3/resources/in.txt";
    private final static String outputFileName = "src/com/agapovp/epam/fundamentals/ht4/ex3/resources/out.txt";

    public static void main(String[] args) throws IOException {
        try (
                FileInputStream inputStream = new FileInputStream(inputFileName);
                FileOutputStream outputStream = new FileOutputStream(outputFileName)
        ) {

            Charset utf8 = Charset.forName("UTF-8");
            Charset utf16 = Charset.forName("UTF-16");

            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            String s = new String(buffer, utf8);
            buffer = s.getBytes(utf16);
            outputStream.write(buffer);
        }
    }
}