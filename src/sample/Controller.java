package sample;

import javax.swing.text.View;

public class Controller {
    /**
     * Defines the methods of what to do upon mouse click
     */

    View view = new View();
    Model model = new Model();

    public void userWantsToLaunchExercise(String exerciseToLaunch) {
        /**
         * Called when user wants to launch the selected exercise
         *
         * @param exerciseToLaunch identifies which ComboBox exercise the user wants to launch
         */

        switch (exerciseToLaunch) {
            // When the exercise is "Launch Pad", a window identical to the first window opens
            case "Launch Pad":
                view.setup();
                break;

            case "Matrix Manager":
                // When the exercise if "Matrix Manager, a different window opens
                model.errorGUI(exerciseToLaunch);
                break;

            default:
                // Other exercises would be added here, but an error message is printed
                // if the exercise is not recognized
                System.out.println("Unrecognized exercise: " + exerciseToLaunch);
        }
    }
}
