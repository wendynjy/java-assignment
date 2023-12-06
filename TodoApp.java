import java.util.Scanner;

interface CRUDOperations {
    void create();
    void read();
    void update();
    void delete();
}

// Main class containing the command line interface
public class TodoApp {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Add Task");
            System.out.println("2. Display Tasks");
            System.out.println("3. Update Task");
            System.out.println("4. Delete Task");
            System.out.println("5. Mark Task as Completed");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Add Task
                    TodoTask newTask = new TodoTask("");
                    newTask.create();
                    todoList.addTask(newTask);
                    break;

                case 2:
                    // Display Tasks
                    todoList.displayTasks();
                    break;

                case 3:
                    // Update Task
                    System.out.println("Enter task name to update:");
                    String oldTaskName = scanner.nextLine();
                    System.out.println("Enter new task name:");
                    String newTaskName = scanner.nextLine();
                    System.out.println("Enter new allowance for completion:");
                    double newAllowance = scanner.nextDouble();
                    scanner.nextLine(); 
                    todoList.updateTask(oldTaskName, newTaskName, newAllowance);
                    break;

                case 4:
                    // Delete Task
                    System.out.println("Enter task name to delete:");
                    String taskToDelete = scanner.nextLine();
                    todoList.deleteTask(taskToDelete);
                    break;

                case 5:
                    // Mark Task as Completed
                    System.out.println("Enter task name to mark as completed:");
                    String taskToComplete = scanner.nextLine();
                    todoList.markTaskAsCompleted(taskToComplete);
                    break;

                case 0:
                    // Exit the program
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
