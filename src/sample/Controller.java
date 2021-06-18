package sample;

/**
 * Defines the methods of what to do upon mouse click
 */
public class Controller {

    // Creating new instances of "View" and "Model"
    View view = new View();
    Model model = new Model();

    /**
     * Called when user wants to launch the selected exercise
     *
     * @param exerciseToLaunch identifies which ComboBox exercise the user wants to launch
     */
    public void userWantsToLaunchExercise(String exerciseToLaunch) {

        switch (exerciseToLaunch) {

            case "Launch Pad":
                // If the exercise is "Launch Pad", a window identical to the first window opens
                view.setup();
                break;

            case "Matrix Manager":
                // If the exercise is "Matrix Manager", a different window opens
                model.errorGUI(exerciseToLaunch);
                break;

            default:
                // Other exercises would be added here, but right now an error message is printed
                // if the exercise is not recognized
                System.out.println("Unrecognized exercise: " + exerciseToLaunch);
        }
    }
}
