package FileIO.i.o.File;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class createFile {

    public static void main(String[] args) throws IOException {
        //Create file using Char Stream class
        File file = new File("testFileOne.txt");

        if(file.createNewFile()){
            System.out.println("File has been created");
        }else{
            System.out.println("File is already exists");
        }
        // Write the file
        FileWriter writer = new FileWriter(file);
        writer.write("Tests Data");
        writer.close();

        // Create and write the file using stream(byte code)
        String data = " testFileTwo.txt";
        FileOutputStream outputStream = new FileOutputStream(data);

        outputStream.write(data.getBytes());
        outputStream.close();


        //create and write file using NIO(new Input/Output)
        String  newData = "File writing using NIO";
        Files.write(Paths.get("testFileThree.txt"), newData.getBytes());

    }

}
