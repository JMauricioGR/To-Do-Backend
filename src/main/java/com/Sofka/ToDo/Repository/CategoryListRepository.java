package com.Sofka.ToDo.Repository;

import com.Sofka.ToDo.Entity.Categorylist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryListRepository extends JpaRepository<Categorylist, Long> {
}
