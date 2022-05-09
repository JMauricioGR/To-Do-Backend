package com.Sofka.ToDo.Controller;

import com.Sofka.ToDo.DTO.ToDoCategoryDTO;
import com.Sofka.ToDo.Entity.Todolist;
import com.Sofka.ToDo.Service.TodoListService;
import com.Sofka.ToDo.Service.TodoListServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:3000/")
public class TodoListController {

    @Autowired
    private TodoListServiceInterface serviceTodo;

    @Autowired
    private TodoListService todoListService;

    @GetMapping("get/todos")
    public List<ToDoCategoryDTO> getAllTodosCategories(){
        return todoListService.getAllTodosCategories();
    }

    @GetMapping("get/todoslist")
    public List<Todolist> getAllTodolist(){
        return serviceTodo.getAllTodolist();
    }

    @PostMapping("save/todo")
    public Todolist saveTodo(@RequestBody Todolist todo){
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
