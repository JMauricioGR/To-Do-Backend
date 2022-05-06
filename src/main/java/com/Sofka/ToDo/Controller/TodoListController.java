package com.Sofka.ToDo.Controller;

import com.Sofka.ToDo.Entity.Todolist;
import com.Sofka.ToDo.Service.TodoListServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class TodoListController {

    @Autowired
    private TodoListServiceInterface serviceTodo;

    @GetMapping("get/todos")
    public List<Todolist> getAllTodolist(){
        return serviceTodo.getAllTodolist();
    }

    @PostMapping("save/todo")
    public Todolist saveTodo(@RequestBody Todolist todo{
        return serviceTodo.saveTodolist(todo);
    }

    @PutMapping("update/todo")
    public Todolist updateTodo(@RequestBody Todolist todo){
        return serviceTodo.updateTodolist(todo);
    }

    @DeleteMapping("delete/todo/{id}")
    public void deleteTodo(@PathVariable Long id){
        serviceTodo.deleteTodolist(id);
    }
}
