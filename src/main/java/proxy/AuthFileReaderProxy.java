package proxy;

public class AuthFileReaderProxy implements FileReader {
    private final RealFileReader realFileReader;
    private String username;
    private final boolean isAuthenticated;

    public AuthFileReaderProxy(String username, String password) {
        this.username = username;
        this.isAuthenticated = authenticate(username, password);
        this.realFileReader = new RealFileReader();
    }

    private boolean authenticate(String username, String password) {
        return "admin".equals(username) && "secret".equals(password);
    }

    @Override
    public void readFile(String filePath) {
        if (isAuthenticated) {
            realFileReader.readFile(filePath);
        } else {
            System.out.println("Access denied: User not authenticated");
        }
    }
}