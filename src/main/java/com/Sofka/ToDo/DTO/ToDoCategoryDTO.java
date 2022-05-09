package com.Sofka.ToDo.DTO;

import com.Sofka.ToDo.Entity.Categorylist;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ToDoCategoryDTO implements Serializable {
    private Long todoId;
    private String todo;
    private Boolean done;
    private Long category;
}
