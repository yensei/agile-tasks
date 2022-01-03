package py.com.mryensei.agile.agile.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.com.mryensei.agile.agile.models.Task;
import py.com.mryensei.agile.agile.service.TaskServiceImpl;

@RestController
@RequestMapping(value = "tasks")
public class TaskController {

    @Autowired
    private TaskServiceImpl taskService;

    public TaskController() {
        
    }

    @GetMapping
    public List<Task> getAll(){
        return taskService.findAll();
    }


    @GetMapping("/{id}")
    public Optional<Task> getTask(@PathVariable(name = "id") int id){
        return taskService.findById(id);
        
    }

    @PostMapping
    public String saveTask(@RequestBody Task task){
        taskService.save(task);
        return "saved";
    }
}
