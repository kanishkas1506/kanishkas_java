import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

    @Override
    public void start(Stage stage) {
        String javaVersion = System.getProperty("java.version");
        String javafxVersion = System.getProperty("javafx.runtime.version");

        Label label1 = new Label("Hello, JavaFX!");
        Label label2 = new Label("Java Version: " + javaVersion);
        Label label3 = new Label("JavaFX Version: " + javafxVersion);

        VBox root = new VBox(10, label1, label2, label3);
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("JavaFX Version Info");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
