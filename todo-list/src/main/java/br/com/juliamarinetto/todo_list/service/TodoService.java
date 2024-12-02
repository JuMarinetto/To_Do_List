package br.com.juliamarinetto.todo_list.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.juliamarinetto.todo_list.entity.Todo;
import br.com.juliamarinetto.todo_list.repository.TodoRepository;

@Service
public class TodoService {

	private TodoRepository todoRepo;

	public TodoService(TodoRepository taskRepo) {
		this.todoRepo = taskRepo;
	}

	public List<Todo> create(Todo task) {
		todoRepo.save(task);
		return list();
	}

	public List<Todo> list() {
		Sort sort = Sort.by("priority").descending().and(
				Sort.by("title").ascending());
		return todoRepo.findAll(sort);
	}

	public List<Todo> update(Todo task) {
		todoRepo.save(task);
		return list();
	}

	public List<Todo> delete(Long id) {
		todoRepo.deleteById(id);
		return list();
	}
}
