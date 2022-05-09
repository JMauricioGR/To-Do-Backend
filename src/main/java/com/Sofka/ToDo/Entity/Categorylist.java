package com.Sofka.ToDo.Entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity(name = "Category")
@Table(name = "category")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categorylist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String category;

    @OneToMany(mappedBy = "categoryid", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JsonIgnoreProperties("categoryid")
    private List<Todolist> todos;

    public Categorylist(Long id){
        super();
        this.id = id;
    }
}