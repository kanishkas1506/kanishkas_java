import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ColorChoiceBox extends Application {

    @Override
    public void start(Stage stage) {
        Label label = new Label("Choose a color:");
        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        choiceBox.getItems().addAll("Red", "Blue", "Green", "Yellow", "Pink");

        Label result = new Label("Selected: None");

        choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldVal, newVal) -> {
            result.setText("Selected: " + newVal);
        });

        VBox root = new VBox(10, label, choiceBox, result);
        Scene scene = new Scene(root, 300, 200);

        stage.setTitle("ChoiceBox Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
