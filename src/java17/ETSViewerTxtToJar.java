package java17;
import java.io.*;
import java.nio.file.*;
public class ETSViewerTxtToJar {
    public static void decode(String srcPath, String targetPath) throws IOException{
        byte[] data = Files.readAllBytes(Paths.get(srcPath));
        data = java.util.Base64.getDecoder().decode(data);

        Files.write(Paths.get(targetPath), data, new OpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING});
    }
    public static void main(String[] args) throws IOException {
        decode("etsviewer.txt", "etsviewer.jar");
    }
}
