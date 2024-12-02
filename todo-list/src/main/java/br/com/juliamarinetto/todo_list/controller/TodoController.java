package br.com.juliamarinetto.todo_list.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.juliamarinetto.todo_list.entity.Todo;
import br.com.juliamarinetto.todo_list.service.TodoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/todos")
public class TodoController {

private TodoService todoService;
	
	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}
	
	@PostMapping
	List<Todo> create(@RequestBody  Todo todo){
		return todoService.create(todo);
	}
	
	@GetMapping
	List<Todo> list(){
		return todoService.list();
	}
	
	@PutMapping
	List<Todo> update(@RequestBody @Valid Todo todo){
		return todoService.update(todo);
	}
	
	@DeleteMapping("{id}")
	List<Todo> create(@PathVariable("id") Long id){
		return todoService.delete(id);
	}
}
