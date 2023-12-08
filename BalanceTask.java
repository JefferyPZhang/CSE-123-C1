// Jeffery Zhang
// TA: Jake Page
// CSE 123
// Due: October 18, 2023
// C1: Survivor Challenge

import java.util.*;

// A class to represent a puzzle task that extends
// the EnduranceTask class. In order to complete the task, the survivor
// must balance on something where alternating steps are needed.

public class BalanceTask extends EnduranceTask {
    private boolean rightStep;
    
    // Constructs a new BalanceTask object, given a task type,
    // task duration, and a task description.

    public BalanceTask(String type, int duration, String description) {
        super(type, duration, description);
        rightStep = true;
    }

    // Returns a list of possible actions by the "survivor".
    @ Override
    public List<String> getActionOptions() {
        List<String> actions = new ArrayList<String>(Arrays.asList("step left", "step right"));
        return actions;
    }

    // "Does" the iterative task based on the action parameter. Throws an
    // IllegalArgumentException if invalid action or if the "survivor" 
    // takes two steps with the same foot consecutively. 
    // Returns true assuming no exceptions.
    @ Override
    public boolean takeAction(String action) {
        if (action.equals("step left") && rightStep ||
            action.equals("step right") && !rightStep) {
            throw new IllegalArgumentException();
        }
        decreaseDuration();
        rightStep = !rightStep;
        return true;
    }
}
