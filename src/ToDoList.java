import java.util.ArrayList;
import java.util.Scanner;


public class ToDoList { // we using private so that only this class can access this variables
    private static ArrayList<String> tasks = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    
    public static void main(String args[]) {
        while (true) {
            displayManu();

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    AddTask();
                    break;
                case 2:
                    ViewAllTasks();
                    break;
                case 3:
                    MarkTaskComplete();
                    break;
                case 4:
                    DeleteTask();
                    break;    
                case 5:
                    System.out.println("Exiting... Thank you ");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        }
    }
    public static void displayManu() {
        
        // for the colours in the output.
        String YELLOW = "\u001B[33m";
        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";

        System.out.println("\n" + RED + "==> To-Do List Application <==" + RESET);
        System.out.println("Enter" + YELLOW + "'1' " + RESET + "For Add Task ");
        System.out.println("Enter" + YELLOW + "'2' " + RESET + "For View All Tasks ");
        System.out.println("Enter" + YELLOW + "'3' " + RESET + "For Mark Task as Complete ");
        System.out.println("Enter" + YELLOW + "'4' " + RESET + "For Delete Task ");
        System.out.println("Enter" + YELLOW + "'5' " + RESET + "For Exit " );
        System.out.print( "Enter your choice: ");
    }
    public static void AddTask(){
        System.out.print(" Enter the Task:");
        String task = sc.nextLine();
        tasks.add(task);
        System.out.println(" Task added successfully!");
    }
    public static void ViewAllTasks(){
        if (tasks.isEmpty()) {
            System.out.println(" No tasks found.");
        } else {
            System.out.println(" \n Your Tasks:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
    public static void MarkTaskComplete(){
        // for the colours (output)
        String GREEN = "\u001B[32m";
        String RESET = "\u001B[0m";

        if (tasks.isEmpty()) {
            System.out.println(" No Tasks Found.");
            return;
        }
        System.out.print(" Enter the Task number to mark as complete: ");
        int taskNumber = sc.nextInt();
        sc.nextLine();

        if (taskNumber <= 0 || taskNumber > tasks.size()) {
            System.out.println(" Invalid task number.");
            return;
        }
        else {
            String completedTask = tasks.get(taskNumber - 1) + " " + GREEN + "[COMPLETED]" + RESET;
            tasks.set(taskNumber - 1 , completedTask);
            System.out.println(" Task '" + completedTask + "' marked as complete and added to the list.");
        }
    }
    public static void DeleteTask(){
        if (tasks.isEmpty()) {
            System.out.println(" No Tasks Found.");
            return;
        }
        System.out.print(" Enter the Task number to delete: ");
        int taskNumber = sc.nextInt();
        sc.nextLine();

        if (taskNumber <= 0 || taskNumber > tasks.size()) {
            System.out.println(" Invalid task number.");
            return;
        }
        else {
            tasks.remove(taskNumber - 1);
            System.out.println(" Task deleted successfully.");
        }
    }
}