package org.prajval;

import java.util.List;

public interface ITaskService {

    CreateDTO createTask(CreateDTO createDTO);

    TaskEntity UpdateTask(UpdateDTO updateDTO);

    TaskEntity assignTask(AssignDTO assignDTO);

    SearchDTO searchTask(int taskId, String title);

    List<TaskEntity> getHistory(int taskId, String title);
}
