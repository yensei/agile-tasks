package py.com.mryensei.agile.agile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import py.com.mryensei.agile.agile.models.Task;

/**
 * TaskRespository
 */
public interface TaskRepository extends JpaRepository<Task, Integer>{        
}