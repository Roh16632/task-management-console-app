public class Task {
    int id;
    String title;
    String description;
    String status;
    String priority;

    Task(int id, String title, String description, String status,String priority) {
        this.id = id;
        this.title = title;
        this.description=description;
        this.status=status;
        this.priority=priority;
    }

        @Override
        public String toString() {
            return "Id: " + id + "\n" +
                    "Title: " + title + "\n" +
                    "Description: " + description + "\n" +
                    "Status: " + status+"\n"+
                    "Priority:"+ priority+"\n"+
                    "========================";


        }

}