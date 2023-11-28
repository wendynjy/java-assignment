import java.util.Scanner;

// Class representing a TodoTask
class TodoTask implements CRUDOperations {
    private String taskName;
    private boolean isCompleted;
    private double dueDate;

    // Constructor
    public TodoTask(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false;
        this.dueDate = 0.0;
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

    // Getter for dueDate
    public double getDueDate() {
        return dueDate;
    }

    // Setter for dueDate
    public void setDueDate(double dueDate) {
        this.dueDate = dueDate;
    }

    // Implement CRUD operations
    @Override
    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name:");
        this.taskName = scanner.nextLine();
        System.out.println("Enter due date (as a double):");
        this.dueDate = scanner.nextDouble();
        System.out.println("Task created: " + this.taskName + " | Due Date: " + this.dueDate);
    }

    @Override
    public void read() {
        System.out.println("Task: " + taskName + " | Due Date: " + dueDate + " | Completed: " + isCompleted);
    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new task name:");
        this.taskName = scanner.nextLine();
        System.out.println("Enter new due date (as a double):");
        this.dueDate = scanner.nextDouble();
        System.out.println("Task updated: " + this.taskName + " | Due Date: " + this.dueDate);
    }

    @Override
    public void delete() {
        System.out.println("Task deleted: " + taskName);
    }
}