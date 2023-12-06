import java.util.Scanner;

interface TaskOperations {
    void displayDetails();
}

// Class representing a TodoTask
class TodoTask implements CRUDOperations, TaskOperations {
    private String taskName;
    private boolean isCompleted;
    private double allowance;

    // Constructor
    public TodoTask(String taskName) {
        this.taskName = taskName;
        this.isCompleted = false;
        this.allowance = 0.00;
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

    // Getter for allowance
    public double getAllowance() {
        return allowance;
    }

    // Setter for allowance
    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    // Implement TaskOperations interface method
    @Override
    public void displayDetails() {
        System.out.println("Task: " + taskName + " | Allowance for completing: " + allowance + " | Completed: " + isCompleted);
    }

    // Implement CRUD operations
    @Override
    public void create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter task name:");
        this.taskName = scanner.nextLine();
        System.out.println("Enter allowance for completion:");
        this.allowance = scanner.nextDouble();
        System.out.println("Task created: " + this.taskName + " | Allowance for completing: " + this.allowance);
    }

    @Override
    public void read() {
        System.out.println("Task: " + taskName + " | Allowance for completing: " + allowance + " | Completed: " + isCompleted);
    }

    @Override
    public void update() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new task name:");
        this.taskName = scanner.nextLine();
        System.out.println("Enter new allowance for completion:");
        this.allowance = scanner.nextDouble();
        System.out.println("Task updated: " + this.taskName + " | Allowance for completing: " + this.allowance);
    }

    @Override
    public void delete() {
        System.out.println("Task deleted: " + taskName);
    }
}