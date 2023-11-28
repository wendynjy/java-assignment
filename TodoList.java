// TodoList class to manage a list of tasks
class TodoList {
    private static final int MAX_TASKS = 10;
    private TodoTask[] tasks;
    private int taskCount;

    public TodoList() {
        this.tasks = new TodoTask[MAX_TASKS];
        this.taskCount = 0;
    }

    public void addTask(TodoTask task) {
        if (taskCount < MAX_TASKS) {
            tasks[taskCount++] = task;
            System.out.println("Task added to the list.");
        } else {
            System.out.println("Task list is full. Cannot add more tasks.");
        }
    }

    public void displayTasks() {
        if (taskCount == 0) {
            System.out.println("Task list is empty.");
        } else {
            System.out.println("Task List:");
            for (int i = 0; i < taskCount; i++) {
                tasks[i].read();
            }
        }
    }

    public void updateTask(String oldTaskName, String newTaskName) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getTaskName().equalsIgnoreCase(oldTaskName)) {
                tasks[i].setTaskName(newTaskName);
                System.out.println("Task name updated from '" + oldTaskName + "' to '" + newTaskName + "'.");
                return;
            }
        }
        System.out.println("Task not found: " + oldTaskName);
    }

    public void markTaskAsCompleted(String taskName) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getTaskName().equalsIgnoreCase(taskName)) {
                tasks[i].setCompleted(true);
                System.out.println("Task marked as completed: " + taskName);
                return;
            }
        }
        System.out.println("Task not found: " + taskName);
    }

    public void deleteTask() {
        
    }
}
