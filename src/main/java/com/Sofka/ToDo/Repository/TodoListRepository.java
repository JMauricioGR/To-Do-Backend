package com.Sofka.ToDo.Repository;

import com.Sofka.ToDo.Entity.Todolist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoListRepository extends JpaRepository<Todolist, Long> {
}
