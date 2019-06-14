import java.util.Date;
import java.util.Calendar;
import java.util.TimerTask;

public class Task{
    private String name;
    private String description;
    private boolean dueDate;
    private boolean location;
}

public Task (String name, String description) {
    this.name = name;
    this.description = description;
    this.dueDate = false;
    this.location = false;
}