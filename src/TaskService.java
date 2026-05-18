import java.util.ArrayList;
import java.util.List;

public class TaskService {
    List<Task> tasks=new ArrayList<>();

    public void AddTask(Task task){
       tasks.add(task);

    }
    public List<Task> getAllTasks() {
        return tasks;
    }
    public Task find(int id) {

        for (Task task : tasks) {

            if (task.id == id) {
                return task;
            }

        }

        return null;
    }
    public void markCompleted(int id) {

        Task task = find(id);

        if (task != null) {
            task.status = "COMPLETED";
        }

    }
    public void deleteTask(int id){

        Task task=find(id);

        tasks.remove(task);
    }
    public void showHighPriorityTasks() {

        for (Task t : tasks) {

            if (t.priority.equals("High")) {
                System.out.println(t);
            }

        }

    }

}
