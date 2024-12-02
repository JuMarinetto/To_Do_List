package br.com.juliamarinetto.todo_list.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.juliamarinetto.todo_list.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{

}
