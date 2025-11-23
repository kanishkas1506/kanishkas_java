import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class TextEditorUI extends Application {

    @Override
    public void start(Stage stage) {

        MenuBar menuBar = new MenuBar();

        // File Menu
        Menu fileMenu = new Menu("File");
        MenuItem newFile = new MenuItem("New");
        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem exit = new MenuItem("Exit");

        exit.setOnAction(e -> stage.close());

        fileMenu.getItems().addAll(newFile, open, save, new SeparatorMenuItem(), exit);

        // Edit Menu
        Menu editMenu = new Menu("Edit");

        // Help Menu
        Menu helpMenu = new Menu("Help");

        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);

        Scene scene = new Scene(layout, 500, 400);

        stage.setTitle("Text Editor Interface");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
