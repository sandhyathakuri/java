package FileIO.i.o.File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import static java.io.LineNumberReader.*;

public class LineByLineRead {
    public static void main(String[] args) throws IOException {
        readFromFile("testFileThree.txt");

    }
    private static void readFromFile(String fileName) throws IOException {
        LineNumberReader  lineNumberReader = new LineNumberReader(new FileReader(fileName));

        // print the initial line number

        System.out.println("Line" + lineNumberReader.getLineNumber());

        //setting initial line number
        lineNumberReader.setLineNumber(10);

        //get current line number
        System.out.println("Line" + lineNumberReader.getLineNumber());

        String str = null;

        while ((str = lineNumberReader.readLine()) != null){
            System.out.println("Line" + lineNumberReader.getLineNumber());

        }
        lineNumberReader.close();
    }
}
