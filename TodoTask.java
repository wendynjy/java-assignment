import java.util.Scanner;

interface TaskOperations {
    void displayDetails();
}

// Class representing a TodoTask
class TodoTask implements CRUDOperations, TaskOperations {
    private String taskName;
    private boolean isCompleted;
    private double dueTime;

    // Constructor
    public TodoTask(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false;
        this.dueTime = 0.00;
    }

    // Getter for taskName
    public String getTaskName() {
        return taskName;
    }

    // Setter for taskName
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    // Getter for isCompleted
    public boolean isCompleted() {
        return isCompleted;
    }

    // Setter for isCompleted
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    // Getter for dueTime
    public double getDueTime() {
        return dueTime;
    }

    // Setter for dueTime
    public void setDueTime(double dueTime) {
        this.dueTime = dueTime;
    }

    // Implement TaskOperations interface method
    @Override
    public void displayDetails() {
        System.out.println("Task: " + taskName + " | Due Time: " + dueTime + " | Completed: " + isCompleted);
    }

    // Implement CRUD operations
    @Override
    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name:");
        this.taskName = scanner.nextLine();
        System.out.println("Enter due time (as a double):");
        this.dueTime = scanner.nextDouble();
        System.out.println("Task created: " + this.taskName + " | Due Time: " + this.dueTime);
    }

    @Override
    public void read() {
        System.out.println("Task: " + taskName + " | Due Time: " + dueTime + " | Completed: " + isCompleted);
    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new task name:");
        this.taskName = scanner.nextLine();
        System.out.println("Enter new due time (as a double):");
        this.dueTime = scanner.nextDouble();
        System.out.println("Task updated: " + this.taskName + " | Due Time: " + this.dueTime);
    }

    @Override
    public void delete() {
        System.out.println("Task deleted: " + taskName);
    }
}