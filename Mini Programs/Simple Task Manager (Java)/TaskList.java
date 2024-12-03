import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class TaskList {
    private List<String> task_list;
    private int count; 
    
    public TaskList() {
        this.task_list = new ArrayList<>();   
        this.count = 0;
    }
    
    public void showList(){
        System.out.println(task_list);
        System.out.println("The current number of items in the list is: " + count);
    }
    
    public void addTask(String newItem) {
        System.out.println("The current number of items in the list is: " + count);
        boolean existingTask = task_list.contains(newItem);
        
        if (!existingTask) {
            task_list.add(newItem);
            count += 1;
            System.out.println("The item: " + newItem + " has been added");
            System.out.println("There are currently " + count + " items in the task list"); 
        } else {
            System.out.println("The item: " + newItem + " already exists in the list.");
        }
    }
    
    public void deleteTask(String deleteItem) {
        System.out.println("The current list contains the following items: " + task_list);
        System.out.println("The current number of items in the list is: " + count);
        boolean containsItem = task_list.contains(deleteItem);
        
        if (containsItem) {
            task_list.remove(deleteItem);
            count -= 1;
            System.out.println("The list after removing " + deleteItem + ": " + task_list);
        } else {
            System.out.println("The item: " + deleteItem + " does not exist in the list.");
        }
    }
    
    public static void main(String[] args) {
        TaskList taskList = new TaskList(); // Create an instance of TaskList
        Scanner input = new Scanner(System.in);

        while (true) { // Continuous execution
            System.out.println("\nPlease select which option you want: 1-Show List, 2-Add Item, 3-Delete Item, 4-Exit");
            int select = input.nextInt();
            input.nextLine(); // Consume the newline left by nextInt()
            
            if (select == 1) {
                taskList.showList();
            } else if (select == 2) {
                System.out.println("Please add the task to the task list: ");
                String item = input.nextLine(); // Read the task to add
                taskList.addTask(item);
            } else if (select == 3) {
                System.out.println("Please input the item to delete from the task list: ");
                String item = input.nextLine(); // Read the task to delete
                taskList.deleteTask(item);
            } else if (select == 4) {
                System.out.println("Exiting the program. Thank you for using the task list!");
                break; // Exit the loop
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        input.close(); // Close the Scanner to prevent resource leaks
    }
}
