package proxy;

public class Main {
    public static void main(String[] args) {
        FileReader unauthorizedReader = new AuthFileReaderProxy("user", "wrongpassword");
        unauthorizedReader.readFile("/path/to/file.txt");

        FileReader authorizedReader = new AuthFileReaderProxy("admin", "secret");
        authorizedReader.readFile("/path/to/file.txt");
    }
}
