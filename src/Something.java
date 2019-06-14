import java.util.Date;
import java.util.Calendar;
//import java.util.TimerTask
import java.util.ArrayList;

/* NEEDS:
1. boolean to check whether random or request
2. boolean to check dueDate
3. Needs a Task class.
*/

public class Something {
    private ArrayList<Task> tasks;
    private int frequency;

    public Something {
        this.tasks = new ArrayList<Task>();
        this.frequency = 1;
    }

    public int getFrequency(){
        return this.frequency;
    }

    public void setFrequency(){
        //set new frequency
    }

    public void add(String name, String description){
        //adds a new task 
    }
}