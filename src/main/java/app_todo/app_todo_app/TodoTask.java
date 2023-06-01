package app_todo.app_todo_app;

import jakarta.persistence.*;

@Entity
@Table(name="tasks")
public class TodoTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="title")
    private String taskTitle;

    @Column(name="status")
    private boolean complete;

    public TodoTask(){
    }

    public todoTask(String taskTitle, boolean complete){
        this.taskTitle = taskTitle;
        this.complete = complete;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }


}
