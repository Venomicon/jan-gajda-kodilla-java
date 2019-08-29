package com.kodilla.spring.portfolio;

import java.util.*;

public class TaskList {
    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTask() {
        tasks.add("task 1");
    }

    public List<String> getTasks() {
        return tasks;
    }
}
