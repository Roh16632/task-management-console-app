import java.sql.SQLOutput;
import java.util.Scanner;
public class TaskAPP {
    public static void main(String[] args) {




        TaskService s=new TaskService();










        boolean running=true;
        //1. Add Task
        //2. View Tasks
        //3. Find Task
        //4. Mark Completed
        //5. Delete Task
        //6. Exit
        Scanner sc = new Scanner(System.in);



        while (running) {

            System.out.println("\nSelect From Menu");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Find Task");
            System.out.println("4. Mark Completed");
            System.out.println("5. Delete Task");
            System.out.println("6. View High Priority Tasks");
            System.out.println("7. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Description: ");
                    String description = sc.nextLine();

                    System.out.print("Enter Status: ");
                    String status = sc.nextLine();

                    System.out.println("Enter Priority:");
                    String priority=sc.nextLine();

                    Task task = new Task(id, title, description, status,priority);

                    s.AddTask(task);

                    System.out.println("Task Added Successfully");
                    break;

                case 2:

                    for (Task t : s.getAllTasks()) {
                        System.out.println(t);
                    }

                    break;

                case 3:

                    System.out.print("Enter Task Id: ");
                    int findId = sc.nextInt();

                    Task foundTask = s.find(findId);

                    System.out.println(foundTask);

                    break;

                case 4:

                    System.out.print("Enter Task Id: ");
                    int completedId = sc.nextInt();

                    s.markCompleted(completedId);

                    System.out.println("Status Updated");

                    break;

                case 5:

                    System.out.print("Enter Task Id: ");
                    int deleteId = sc.nextInt();

                    s.deleteTask(deleteId);

                    System.out.println("Task Deleted");

                    break;
                case 6:



                    System.out.println("High Priority Tasks:");

                    s.showHighPriorityTasks();

                    break;





                case 7:

                    running = false;

                    System.out.println("Exiting...");

                    break;

                default:

                    System.out.println("Invalid Choice");

            }

        }

        }

    }

