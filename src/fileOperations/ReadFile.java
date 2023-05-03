package fileOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        String path="src/fileOperations/CURL_Try.txt";
        FileInputStream fis=new FileInputStream(path);

        int control=0;
        String fileContent="";

        while ((control=fis.read())!=-1){
            //System.out.print((char)control);
            fileContent +=(char)control;
        }



    }
}
