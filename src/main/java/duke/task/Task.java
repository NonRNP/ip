package duke.task;

public class Task {
    private String description;
    private boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public boolean isDone() {
        return isDone;
    }

    public void markAsDone() {
        isDone = true;
    }

    public String toString() {
        String statusIcon;
        if (isDone) {
            statusIcon = "X";
        } else {
            statusIcon = " ";
        }
        return "[" + statusIcon + "] " + description;
    }
}
