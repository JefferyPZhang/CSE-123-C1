# Creative Project 1: Survivor Challenge

**Assignment Spec:**
Background
The popular TV show Survivor, like many other competition or "reality" shows, often puts its contestants through challenges consisting of a series of tasks that must be completed to earn a prize or reward. The challenges can take many different forms and require a wide range of skills. In this assignment, you will implement several classes to represent different types of tasks for a simulation of these types of challenges.

**Simulation Structure**
In our simulation, a challenge will be represented by a list of tasks as defined by the provided Task class. You will be responsible for implementing several specific types of tasks, as follows:

EnduranceTask - tasks that test endurance by requiring contestants to repeat a single action many times in a row

e.g. jumping over a series of hurdles, hanging from a wall for an extended period of time, swimming a number of laps in a pool or lake

PrecisionTask - tasks that test skill and accuracy by requiring contestants to take a particular set of actions in a particular order

e.g. completing an obstacle course, pushing a series of buttons in a particular order

PuzzleTask - tasks that test intelligence or memory by requiring constants to solve a puzzle or riddle

e.g. solving a math problem

One additional task type of your choice that extends one of the above task types

e.g. a strength task, a speed task, a memory task, or any other task you can think of!

Each type of task will be represented by a single class, which should (directly or indirectly) extend the Task class specified in Task.java. See the source file for the required methods. 

**Required Constructors**
Each of the required classes should have the following constructors (you may include additional constructors if you wish):

public EnduranceTask(String type, int duration, String description)
String type - the type of task, which is also the action required to complete the task

This must be one of the valid actions for this task type

int duration - the number of times the action must be taken to complete the task

String description - a text description of the task

public PrecisionTask(List<String> requiredActions, String description)
List<String> requiredActions - the sequence of actions that are required to complete the task

Each action must be one of the valid actions for this task type

Actions need to be completed in order to complete the task

String description - a text description of the task

public PuzzleTask(String solution, List<String> hints, String description)
String solution - the expected solution for this task

The solution will be provided with the "solve" action

List<String> hints - an ordered list of hints to be provided to the client when taking the "hint" action

May be empty if there are no hints

If all hints have already been given (including if there are no hints), takeAction() should return false for the hint action.

String description - a text description of the task

Includes the most recent hint given.

Finally, all implementations of a task must throw an IllegalArgumentException in takeAction() in the event of an invalid action.
