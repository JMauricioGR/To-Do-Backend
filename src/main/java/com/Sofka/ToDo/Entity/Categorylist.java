package com.Sofka.ToDo.Entity;
import lombok.Data;
import javax.persistence.*;

@Entity(name = "Category")
@Table(name = "category")
@Data
public class Categorylist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String category;
}