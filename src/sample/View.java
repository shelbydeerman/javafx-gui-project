package sample;
//remove this post test
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * Defines how to create a new instance of the Launch Pad GUI
 */
public class View {

    /**
     * Called to create a new instance of "Launch Pad"
     * Elements include a label, a ComboBox, and a "Launch" button
     */
    public void setup() {

        Label lbl = new Label("Select the exercise to launch");
        lbl.setFont(new Font("Times New Roman", 12));
        ComboBox<String> projects = new ComboBox<>();
        projects.getItems().add("Launch Pad");
        projects.getItems().add("Matrix Manager");
        Button launch = new Button("Launch");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.add(lbl, 0, 0);
        grid.add(projects, 1, 0);
        VBox root = new VBox(10);
        root.getChildren().addAll(grid, launch);
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setWidth(400);
        stage.setHeight(200);
        stage.show();

        // Creating a new instance of the class "Controller"
        Controller controller = new Controller();

        // Calls userWantsToLaunchExercise for the selected exercise upon
        // mouse click of the button "Launch"
        launch.setOnAction(event -> {
            if (projects.getValue() == null) {
                System.out.println("Please select a value before you submit");
            } else {
                controller.userWantsToLaunchExercise(projects.getSelectionModel().getSelectedItem());
            }
        });
    }
}