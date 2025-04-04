package QuanLyTask;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String taskName, String status) {
        System.out.println("Team member " + name + " notified: Task " + taskName + " is now " + status);
    }
}
