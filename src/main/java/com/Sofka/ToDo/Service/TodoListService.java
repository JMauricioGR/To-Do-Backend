package com.Sofka.ToDo.Service;

import com.Sofka.ToDo.DTO.ToDoCategoryDTO;
import com.Sofka.ToDo.Entity.Categorylist;
import com.Sofka.ToDo.Entity.Todolist;
import com.Sofka.ToDo.Repository.TodoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoListService implements TodoListServiceInterface{

    @Autowired
    private TodoListRepository todoListRepository;




    public List<ToDoCategoryDTO> getAllTodosCategories(){
        return todoListRepository.findAll().stream().map(this::convertEntityToDTO).collect(Collectors.toList());
    }

    private ToDoCategoryDTO convertEntityToDTO(Todolist todo){
        ToDoCategoryDTO toDoCategoryDTO = new ToDoCategoryDTO();
        toDoCategoryDTO.setTodoId(todo.getId());
        toDoCategoryDTO.setTodo(todo.getTodo());
        toDoCategoryDTO.setDone(todo.getDone());
        toDoCategoryDTO.setCategory(todo.getCategoryid().getId());
        return toDoCategoryDTO;
    }

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