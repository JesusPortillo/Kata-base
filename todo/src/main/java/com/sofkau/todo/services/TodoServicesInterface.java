package com.sofkau.todo.services;

import com.sofkau.todo.entities.Todo;

import java.util.ArrayList;

public interface TodoServicesInterface {

    public ArrayList<Todo> listAllTodo();
    public Todo saveTodo(Todo todo);
    public void deleteTodo(Long id);
    public Todo getTodo(Long id);
}
