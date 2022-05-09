package com.Sofka.ToDo.Entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Entity(name = "TodoList")
@Table(name = "todolist")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Todolist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String todo;
    private Boolean done;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties("todos")
    @JoinColumn(name = "categoryid")
    private Categorylist categoryid;
}