class TaskLinkedList {

    private Node head;

    // Add Task
    public void addTask(Task task) {

        Node newNode = new Node(task);

        if (head == null) {

            head = newNode;
        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        System.out.println("Task added successfully.");
    }

    // Search Task
    public Task searchTask(int taskId) {

        Node current = head;

        while (current != null) {

            if (current.task.taskId == taskId) {
                return current.task;
            }

            current = current.next;
        }

        return null;
    }

    // Traverse Tasks
    public void displayTasks() {

        if (head == null) {

            System.out.println("No tasks found.");
            return;
        }

        Node current = head;

        while (current != null) {

            System.out.println(current.task);
            current = current.next;
        }
    }

    // Delete Task
    public void deleteTask(int taskId) {

        if (head == null) {

            System.out.println("Task list is empty.");
            return;
        }

        // If head node needs deletion
        if (head.task.taskId == taskId) {

            head = head.next;

            System.out.println("Task deleted successfully.");
            return;
        }

        Node current = head;

        while (current.next != null &&
                current.next.task.taskId != taskId) {

            current = current.next;
        }

        if (current.next == null) {

            System.out.println("Task not found.");
        } else {

            current.next = current.next.next;

            System.out.println("Task deleted successfully.");
        }
    }
}