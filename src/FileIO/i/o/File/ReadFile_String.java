package FileIO.i.o.File;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile_String {
    public static void main(String[] args) {
        System.out.println(readAllFile("testFileTwo.txt"));
    }
    private static  String readAllFile(String fileName){
        String content = "";

        try{
            content = new String(Files.readString(Paths.get(fileName)));
        }catch (IOException e){
            System.out.println("There is an issue");
        }
        return content;
    }

}
