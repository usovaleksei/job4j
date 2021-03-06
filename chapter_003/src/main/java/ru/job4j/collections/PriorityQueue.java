package ru.job4j.collections;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Method put new task according priority
     * @param task
     */
    public void put(Task task) {
        var index = 0;
        for (var element:
             tasks) {
            if (element.getPriority() > task.getPriority()) {
                break;
            } else index++;
        }
        this.tasks.add(index, task);
    }

    /**
     * Method to return first task from list and deleted this task
     * @return
     */

    public Task take() {
        return tasks.poll();
    }
}
