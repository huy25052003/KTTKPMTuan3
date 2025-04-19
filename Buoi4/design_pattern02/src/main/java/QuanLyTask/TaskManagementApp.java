package QuanLyTask;

public class TaskManagementApp {
    public static void main(String[] args) {
        Task task1 = new Task("Implement Login", "Pending");
        Task task2 = new Task("Fix Bug #123", "In Progress");

        TeamMember member1 = new TeamMember("Huy");
        TeamMember member2 = new TeamMember("Khoa");

        task1.addObserver(member1);
        task1.addObserver(member2);
        task2.addObserver(member1);

        System.out.println("Updating task statuses...");
        task1.setStatus("Completed");
        task2.setStatus("Reviewing");
    }
}

