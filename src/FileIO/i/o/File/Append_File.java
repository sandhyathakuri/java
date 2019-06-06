package FileIO.i.o.File;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Append_File {
    public static void main(String[] args) throws IOException {

        String textToAppend = "Java Learning append";
        BufferedWriter writer = new BufferedWriter(new FileWriter("testFileOne.txt", true));

        //writer.newLine();
        writer.write(textToAppend);
        writer.close();
        FileOutputStream outputStream = new FileOutputStream("testFileTwo.txt",true);
        byte[] strByte = textToAppend.getBytes();

        outputStream.write(strByte);
        outputStream.close();
    }
}
