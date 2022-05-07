package com.Sofka.ToDo.Controller;

import com.Sofka.ToDo.Entity.Categorylist;
import com.Sofka.ToDo.Service.CategoryListServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("api/v1/")
@CrossOrigin(origins = "http://localhost:3000/")
public class CategoryListController {
    @Autowired
    private CategoryListServiceInterface serviceCategory;

    @GetMapping("get/categories")
    public List<Categorylist> getAllBooks(){
        return serviceCategory.getAllCategorylist();
    }

    @PostMapping("save/category")
    public Categorylist saveBook(@RequestBody Categorylist category){
        return serviceCategory.saveCategorylist(category);
    }

    @DeleteMapping("delete/category/{id}")
    public void deleteBook(@PathVariable Long id){
        serviceCategory.deleteCategorylist(id);
    }


}
