package com.Sofka.ToDo.Service;

import com.Sofka.ToDo.Entity.Categorylist;

import java.util.List;

public interface CategoryListServiceInterface {
    List<Categorylist> getAllCategorylist();
    Categorylist saveCategorylist(Categorylist category);
    void deleteCategorylist(Long id);
}
