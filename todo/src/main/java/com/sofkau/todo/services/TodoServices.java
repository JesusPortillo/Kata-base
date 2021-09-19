package com.sofkau.todo.services;

import com.sofkau.todo.entities.Todo;
import com.sofkau.todo.repositories.TodoRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class TodoServices implements TodoServicesInterface{

    @Autowired
    private TodoRepositoryInterface repository;

    @Override
    public ArrayList<Todo> listAllTodo() {
        return (ArrayList<Todo>) repository.findAll();
    }

    @Override
    public Todo saveTodo(Todo todo) {
        return repository.save(todo);
    }

    @Override
    public void deleteTodo(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Todo> getTodo(Long id) {
        return repository.findById(id);
    }
}
