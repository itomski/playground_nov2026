package de.lubowiecki.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskRepository {

    private List<Task> tasks;

    public TaskRepository() {
        this.tasks = new ArrayList<>();
    }

    public void add(Task task) {
        tasks.add(task);
    }

    public List<Task> getAll() {
        return Collections.unmodifiableList(tasks);
    }
}
