package service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Task;

import repository.TaskRepository;

@Service
public class TaskService {

	private TaskRepository taskRepo;

	public TaskService(TaskRepository taskRepo) {
		this.taskRepo = taskRepo;
	}

	public List<Task> create(Task task) {
		taskRepo.save(task);
		return list();
	}

	public List<Task> list() {
		Sort sort = Sort.by("priority").descending().and(
				Sort.by("title").ascending());
		return taskRepo.findAll(sort);
	}

	public List<Task> update(Task task) {
		taskRepo.save(task);
		return list();
	}

	public List<Task> delete(Long id) {
		taskRepo.deleteById(id);
		return list();
	}

}
