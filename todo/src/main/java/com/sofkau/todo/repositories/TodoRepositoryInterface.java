package com.sofkau.todo.repositories;

import com.sofkau.todo.entities.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepositoryInterface extends CrudRepository<Todo, Long> {}
