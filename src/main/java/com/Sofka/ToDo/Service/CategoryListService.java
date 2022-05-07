package com.Sofka.ToDo.Service;

import com.Sofka.ToDo.Entity.Categorylist;
import com.Sofka.ToDo.Repository.CategoryListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryListService implements CategoryListServiceInterface {

    @Autowired
    private CategoryListRepository categoryListRepository;

    @Override
    public List<Categorylist> getAllCategorylist() {
        return categoryListRepository.findAll();
    }

    @Override
    public Categorylist saveCategorylist(Categorylist category) {
        return categoryListRepository.save(category);
    }

    @Override
    public void deleteCategorylist(Long id) {
        categoryListRepository.deleteById(id);
    }
}
