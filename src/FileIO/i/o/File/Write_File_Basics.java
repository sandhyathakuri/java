package FileIO.i.o.File;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Write_File_Basics {

    /*
    Write file using BufferedWriter
    Write file using FileWriter/PrinterWriter
    Write file using FileOutputStream
    Write file using DataOutputStream
    Write file using FileChannel
    Write file usingJava 7 path
     */
    public static void main(String[] args) throws IOException{
        usingBufferedWriter();
        usingFileWriter();

        usingFileOutputStream();
        usingDataOutputStream();
        usingFileChannel();
        System.out.println(System.getProperty("user.dir"));

    }
    private static void usingBufferedWriter() throws IOException{
        String fileContent = "Hello Java Learner!! Welcome to how to do java file io";
        BufferedWriter writer = new BufferedWriter(new FileWriter("testFileOne.txt"));
        writer.write(fileContent);
        writer.close();


    }
public  static void usingFileWriter() throws IOException{

        String fileContent = "Hello Java Learner !! welcome to using file writer";
        FileWriter fileWriter = new FileWriter("testFileTwo.txt");
        fileWriter.write(fileContent);
        fileWriter.close();

        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(fileContent);
        printWriter.printf("Blog name is %s", "howtodoinjava.com");
        fileWriter.close();
        printWriter.close();


}
public static void usingFileOutputStream() throws IOException{
        String fileContent = "Hello Java Learner!! welcome to File output Stream";
        FileOutputStream outputStream = new FileOutputStream("testFileThree.txt");
        byte[] strByte = fileContent.getBytes();
        outputStream.write(strByte);
        outputStream.close();


}
public static void usingDataOutputStream() throws IOException{
        String fileContent = "Hello Java Learner!! Welcome to using DataOutputStream class";
        FileOutputStream outputStream = new FileOutputStream("testFileThree.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(outputStream));
        dataOutputStream.writeUTF(fileContent);
        dataOutputStream.close();

}
    public static void usingFileChannel() throws IOException{
        String fileContent = "Hello Java Learner!! Welcome to using FileChannel class";
        RandomAccessFile stream = new RandomAccessFile("testFileFive.txt", "rw");
        FileChannel channel = stream.getChannel();
        byte[] strByteArr = fileContent.getBytes();

        // this is to create the space in file for contented to write

        ByteBuffer buffer = ByteBuffer.allocate((strByteArr.length));
        buffer.put(strByteArr);
        buffer.flip();
        channel.write(buffer);
        stream.close();
        channel.close();
    }

}
