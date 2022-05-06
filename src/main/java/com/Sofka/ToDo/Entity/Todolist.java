package com.Sofka.ToDo.Entity;
import lombok.Data;
import javax.persistence.*;

@Entity(name = "TodoList")
@Table(name = "todolist")
@Data
public class Todolist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String todo;
    private Boolean done;
}