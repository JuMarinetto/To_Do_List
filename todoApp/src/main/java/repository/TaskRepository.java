package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.TaskModel;

public interface TaskRepository extends JpaRepository<TaskModel, Long>{

}
