package py.com.mryensei.agile.agile.service;

import java.util.List;
import java.util.Optional;

import py.com.mryensei.agile.agile.models.Task;

/**
 * TaskService
 */
public interface TaskService {
    public List<Task> findAll();
    Optional<Task> findById(int id);
    Task save(Task task); 
}