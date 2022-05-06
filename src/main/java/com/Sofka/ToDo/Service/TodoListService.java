package com.Sofka.ToDo.Service;

import com.Sofka.ToDo.Entity.Todolist;
import com.Sofka.ToDo.Repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TodoListService implements TodoListServiceInterface{

    @Autowired
    private TodoListRepository todoListRepository;

    @Override
    public List<Todolist> getAllTodolist() {
        return todoListRepository.findAll();
    }

    @Override
    public Todolist saveTodolist(Todolist todolist) {
        return todoListRepository.save(todolist);
    }

    @Override
    public Todolist updateTodolist(Todolist todolist) {
        return todoListRepository.save(todolist);
    }

    @Override
    public void deleteTodolist(Long id) {
        todoListRepository.deleteById(id);
    }
}