package py.com.mryensei.agile.agile.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import py.com.mryensei.agile.agile.models.Task;
import py.com.mryensei.agile.agile.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{

    @Autowired
    private TaskRepository repository;

    public List<Task> findAll(){
        return repository.findAll();
    }

    @Override
    public Optional<Task> findById(int id) {
        return repository.findById(id);        
    }

    @Override
    public Task save(Task task) {
        return repository.save(task);
    }    
}
