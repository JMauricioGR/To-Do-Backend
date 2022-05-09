package com.Sofka.ToDo.Service;

import com.Sofka.ToDo.DTO.ToDoCategoryDTO;
import com.Sofka.ToDo.Entity.Todolist;

import java.util.List;

public interface TodoListServiceInterface {
    List<Todolist> getAllTodolist();
    Todolist saveTodolist(Todolist todolist);
    Todolist updateTodolist(Todolist todolist);
    void deleteTodolist(Long id);

}
