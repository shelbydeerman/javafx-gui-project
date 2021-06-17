package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {

        setup();
    }

    private void setup() {

        Label lbl = new Label("Select the exercise to launch");
        lbl.setFont(new Font("Times New Roman", 12));
        ComboBox<String> projects = new ComboBox<>();
        projects.getItems().add("Launch Pad");
        projects.getItems().add("Matrix Manager");
        Button launch = new Button("Launch");
        launch.setOnAction(event -> {
            if (projects.getValue() == null) {
                System.out.println("Please select a value before you submit");
                // make this a label that pops up instead of printed?
            } else {
                userWantsToLaunchExercise(projects.getSelectionModel().getSelectedItem());
            }
        });

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
    }



    public static void main(String[] args) {
        launch(args);
    }

    public void userWantsToLaunchExercise(String exerciseToLaunch) {

        switch (exerciseToLaunch) {
            case "Launch Pad":
                setup();
                break;

            case "Matrix Manager":
                System.out.println(exerciseToLaunch + " is not yet implemented");
                break;

            default:
                System.out.println("Unrecognized exercise: " + exerciseToLaunch);
        }
    }
}
