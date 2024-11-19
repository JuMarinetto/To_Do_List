package service;

import org.springframework.beans.factory.annotation.Autowired;

import repository.TaskRepository;

public class TaskService{

	@Autowired
	private TaskRepository taskRepo;

}
