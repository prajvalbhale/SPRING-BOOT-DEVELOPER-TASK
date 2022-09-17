package org.prajval;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, String> {

    @Query(value = "select * from task_planner where task_id = :taskId and title = :title and status = 'created'", nativeQuery = true)
    TaskEntity getSearchResult(int taskId, String title);

    @Query(value = "select * from task_planner where task_id = :taskId and title = :title", nativeQuery = true)
    List<TaskEntity> getHistory(int taskId, String title);
}
