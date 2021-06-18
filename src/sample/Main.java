package sample;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Main class for Launch Pad exercise
 */
public class Main extends Application {

    /**
     * Creating a new instance of the class 'View'
     */
    View view = new View();

    @Override
    public void start(Stage primaryStage) {
        view.setup();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
