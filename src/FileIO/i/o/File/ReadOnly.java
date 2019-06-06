package FileIO.i.o.File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadOnly {
    public static void main(String[] args) throws IOException {
        readOnlyUsingSetWritable();

    }
    public static void readOnlyUsingSetWritable() throws IOException{
        //THis is how you can set to be read only

        File readOnly = new File("tesFileSix.txt");
        boolean flag = readOnly.setReadOnly();
        //This is another way to setting file to read only
        //boolean rw = readOnly.setWritable(true);


        if (flag == true){
            System.out.println("File is read only");
        }else{
            System.out.println("File is not read only");

        }

        FileWriter writer = new FileWriter(readOnly);
        writer.write("Please test this readonly file");
        writer.close();
    }

}
