package com.sofkau.todo.controllers;

import com.sofkau.todo.entities.Todo;
import com.sofkau.todo.services.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoController {

    @Autowired
    private TodoServices service;

    @GetMapping(value = "api/todos")
    public Iterable<Todo> list(){
        return service.listAllTodo();
    }

    @PostMapping(value = "api/todo")
    public Todo save(@RequestBody Todo todo){
        return service.saveTodo(todo);
    }

    @PutMapping(value = "api/todo")
    public Todo update(@RequestBody Todo todo){
        if(todo.getId() != null){
            return service.saveTodo(todo);
        }
        throw new RuntimeException("No existe el id para actualziar");
    }

    @DeleteMapping(value = "api/{id}/todo")
    public void delete(@PathVariable("id")Long id){
        service.deleteTodo(id);
    }

    @GetMapping(value = "api/{id}/todo")
    public Optional<Todo> get(@PathVariable("id") Long id){
        return service.getTodo(id);
    }

}