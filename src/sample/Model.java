package sample;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Defines the GUI that is launched when "Matrix Manager" is selected
 */
public class Model {

    /**
     * Called to create a new instance of "Matrix Manager".
     * In the future, can be used for any exercises in the ComboBox
     * that are not yet implemented.
     * Elements include a label
     *
     * @param exercise is the exercise that was picked from the ComboBox
     */
    public void errorGUI(String exercise) {

        Label matrixLbl = new Label(exercise + " is not yet implemented");
        HBox root = new HBox();
        root.getChildren().add(matrixLbl);
        root.setAlignment(Pos.CENTER);

        Scene sc = new Scene(root);
        Stage stage2 = new Stage();
        stage2.setScene(sc);
        stage2.setTitle(exercise);
        stage2.setWidth(400);
        stage2.setHeight(200);
        stage2.show();
    }
}
