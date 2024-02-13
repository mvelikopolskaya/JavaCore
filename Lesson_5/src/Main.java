import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Backup backup = new Backup();
        backup.copyDirectiory("./src", "./backup");
    }
}