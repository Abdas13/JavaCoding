package challenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText {

    public static void WriteTextFile() throws IOException {
        String fileContent = "This is Java Interview question.";
        BufferedWriter writer = new BufferedWriter((new FileWriter("C:/Users/abdas/Documents/samplefile.txt")));
        writer.write(fileContent);
        writer.close();
    }

    public static void main(String[] args) {

    }
}
