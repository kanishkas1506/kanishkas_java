import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class StudentForm extends Application {

    @Override
    public void start(Stage stage) {

        TextField nameField = new TextField();
        nameField.setPromptText("Enter Name");

        TextField rollField = new TextField();
        rollField.setPromptText("Enter Roll No");
        ToggleGroup genderGroup = new ToggleGroup();
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        male.setToggleGroup(genderGroup);
        female.setToggleGroup(genderGroup);
        HBox genderBox = new HBox(10, male, female);
        ComboBox<String> dept = new ComboBox<>();
        dept.getItems().addAll("CSE", "ECE", "EEE", "MECH","IT", "CIVIL");
        TextArea output = new TextArea();
        output.setEditable(false);
        Button submit = new Button("Submit");
        submit.setOnAction(e -> {
            String name = nameField.getText();
            String roll = rollField.getText();
            RadioButton selectedGender = (RadioButton) genderGroup.getSelectedToggle();
            String gender = (selectedGender != null) ? selectedGender.getText() : "Not Selected";
            String department = dept.getValue();

            output.setText("Student Information:\n"
                    + "Name: " + name + "\n"
                    + "Roll No: " + roll + "\n"
                    + "Gender: " + gender + "\n"
                    + "Department: " + department);
        });

        VBox root = new VBox(10, nameField, rollField, genderBox, dept, submit, output);
        Scene scene = new Scene(root, 400, 350);

        stage.setTitle("Student Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
