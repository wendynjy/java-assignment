import java.util.Scanner;

// Interface for CRUD operations
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
            scanner.nextLine(); // Consume the newline character

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
                    String taskToUpdate = scanner.nextLine();
                    todoList.markTaskAsCompleted(taskToUpdate);
                    break;

                case 4:
                    // Delete Task
                    // TODO: Implement delete task functionality
                    System.out.println("Delete Task - Not implemented yet.");
                    break;

                case 5:
                    // Mark Task as Completed
                    // TODO: Implement mark task as completed functionality
                    System.out.println("Mark Task as Completed - Not implemented yet.");
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
