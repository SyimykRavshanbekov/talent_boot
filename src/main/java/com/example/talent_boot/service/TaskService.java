package com.example.talent_boot.service;

import com.example.talent_boot.model.Task;

import java.util.List;

public interface TaskService {
    List<Task> getAllTasks(Long id);

    void addTask(Long id, Task task);

    Task getTaskById(Long id);

    void updateTask(Task task, Long id);

    void deleteTask(Long id);
}
