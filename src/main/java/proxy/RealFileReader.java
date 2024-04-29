package proxy;

public class RealFileReader implements FileReader {
    @Override
    public void readFile(String filePath) {
        System.out.println("Reading file: " + filePath);
    }
}