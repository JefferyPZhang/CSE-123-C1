// Jeffery Zhang
// TA: Jake Page
// CSE 123
// Due: October 18, 2023
// C1: Survivor Challenge

import java.util.*;

// A class to represent an endurance task that implements the 
// Task abstract class. In order to complete the task, the survivor
// must carry out a repetitive action.

public class EnduranceTask extends Task {
    private String type;
    private int duration;

    // Constructs a new EnduranceTask object, given a type,
    // duration, and description.
    public EnduranceTask(String type, int duration, String description) {
        super(description);
        this.type = type;
        this.duration = duration;
    }

    // Returns a list of possible actions by the "survivor".
    @ Override
    public List<String> getActionOptions() {
        List<String> actions = new ArrayList<String>(Arrays.asList("jump", "run", "swim", "crawl", "climb"));
        return actions;
    }

    // Helper method for both this class and BalanceTask.
    // Decreases the duration of the task.
    public void decreaseDuration() {
        duration--;
    }

    @ Override
    // Checks if the task is complete by returning
    // whether or not duration is 0.
    public boolean isComplete() {
        return (duration == 0);
    }

    @ Override
    // "Does" the iterative task based on the action parameter. Throws an
    // IllegalArgumentException if invalid action. Returns true assuming 
    // no exceptions.
    public boolean takeAction(String action) {
        if (!action.equals(type)) {
            throw new IllegalArgumentException();
        }
        decreaseDuration();
        return true;
    }
}
