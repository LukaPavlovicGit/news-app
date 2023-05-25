package com.example.newsapp.repository;

import com.example.newsapp.entities.Category;

import java.util.List;

public interface CategoryRepository {
    List<Category> getAll();
    Category insert(Category category);
    Category update(Category category);
    Category delete(Integer id);
}
