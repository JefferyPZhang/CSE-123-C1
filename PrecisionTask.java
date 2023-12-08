// Jeffery Zhang
// TA: Jake Page
// CSE 123
// Due: October 18, 2023
// C1: Survivor Challenge

import java.util.*;

// A class to represent a precision task that implements the 
// Task abstract class. In order to complete the task, the survivor
// must carry out certain actions in a certain order.

public class PrecisionTask extends Task {
    private List<String> requiredActions;

    // Constructs a new PrecisionTask object, given a list
    // of required actions and a task description.
    public PrecisionTask(List<String> requiredActions, String description) {
        super(description);
        this.requiredActions = requiredActions;
    }

    // Returns a list of possible actions by the "survivor".
    @ Override
    public List<String> getActionOptions() {
        List<String> actions = new ArrayList<String>(Arrays.asList("jump", "run", "swim", "crawl", "climb"));
        return actions;
    }

    // Checks if the task is complete by returning
    // whether or not the amount of req. actions is 0.
    @ Override
    public boolean isComplete() {
        return (requiredActions.isEmpty());
    }

    // "Does" the iterative task based on the action parameter. Throws an
    // IllegalArgumentException if invalid action. 
    // Returns true assuming no exceptions.
    @ Override
    public boolean takeAction(String action) {
        if (!action.equals(requiredActions.get(0))) {
            throw new IllegalArgumentException();
        }
        requiredActions.remove(0);
        return true;
    }
}
