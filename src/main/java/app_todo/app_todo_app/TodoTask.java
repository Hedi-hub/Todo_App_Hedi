package app_todo.app_todo_app;

import jakarta.persistence.*;

@Entity
@Table(name="tasks")
public class TodoTask {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}
