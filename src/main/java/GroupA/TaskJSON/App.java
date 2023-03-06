package GroupA.TaskJSON;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Settings settings = new Settings();

        settings.writeToJson();
        settings.readFromJson();

    }
}
