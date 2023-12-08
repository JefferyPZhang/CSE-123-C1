//// // Jeffery Zhang
// TA: Jake Page
// CSE 123
// Due: October 18, 2023
// C1: Survivor Challenge

import java.util.*;

// A class to represent a puzzle task that implements the 
// Task abstract class. In order to complete the task, the survivor
// must solve a problem, asking for hints if needed.

public class PuzzleTask extends Task {
    private List<String> hints;
    private String solution;
    private boolean isCorrect;
    private String lastHint;

    // Constructs a new PuzzleTask object, given a solution,
    // a list of hints, and a task description.

    public PuzzleTask(String solution, List<String> hints, String description) {
        super(description);
        this.solution = solution;
        this.hints = hints;
        isCorrect = false;
    }

    // Returns a list of possible actions by the "survivor".
    @ Override
    public List<String> getActionOptions() {
        List<String> actions = new ArrayList<String>(Arrays.asList("hint", "solve <solution>"));
        return actions;
    }

    @ Override
    // Returns the task question, including the
    // last hint used, if any.
    public String getDescription() {
        String description = super.getDescription();
        if (lastHint != null) {
            description += "\n HINT: " + lastHint;
        }
        return description;
    }

    @ Override
    // Checks if the task is complete by returning
    // whether or not the "survivor" answered correctly.
    public boolean isComplete() {
        return isCorrect;
    }

    @ Override
    // "Does" the iterative task based on the action parameter. 
    // Either offers a hint or confirms correct answer. 
    // Throws an IllegalArgumentException if invalid action or if "survivor" 
    // asks for hint when there are none. Returns true assuming no exceptions.
    public boolean takeAction(String action) {
        boolean isHint = action.equals("hint");
        boolean isSolution = action.equals("solve " + solution);
        if (!isHint && !isSolution) {
            throw new IllegalArgumentException();
        }
        if (isSolution) {
            isCorrect = true;
            return true;
        } else if (isHint && !hints.isEmpty()) {
            lastHint = hints.get(0);
            hints.remove(0);
            return true;
        } else {
            return false;
        }
    }
}
