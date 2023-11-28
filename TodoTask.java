import java.util.Scanner;

// Class representing a TodoTask
class TodoTask implements CRUDOperations {
    private String taskName;
    private boolean isCompleted;

    // Constructor
    public TodoTask(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false;
    }

    // Getter for taskName
    public String getTaskName() {
        return taskName;
    }

    // Getter for isCompleted
    public boolean isCompleted() {
        return isCompleted;
    }

    // Setter for isCompleted
    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    // Implement CRUD operations
    @Override
    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name:");
        this.taskName = scanner.nextLine();
        System.out.println("Task created: " + this.taskName);
    }

    @Override
    public void read() {
        System.out.println("Task: " + taskName + " | Completed: " + isCompleted);
    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new task name:");
        this.taskName = scanner.nextLine();
        System.out.println("Task updated: " + this.taskName);
    }

    @Override
    public void delete() {
        System.out.println("Task deleted: " + taskName);
    }
}