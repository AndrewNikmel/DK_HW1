import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        new GameWindow();
        new ConnectWindow(new LogHandler("Hometask_Log"));
    }
}