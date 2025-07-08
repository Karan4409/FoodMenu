package com.Restraunt.FoodMenu.service;

import com.Restraunt.FoodMenu.exception.ResourceNotFoundException;
import com.Restraunt.FoodMenu.model.Menu;
import com.Restraunt.FoodMenu.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MenuService {

    @Autowired
    private MenuRepository menuRepository;

    public List<Menu> getAllFood() {
        return menuRepository.findAll();
    }

    public Menu getFoodWithId(int id) {
        return menuRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Item with id : " + id + "not found"));
    }

    public Menu addFood(Menu menu) {
        return menuRepository.save(menu);
    }

    public String deleteFoodWithId(int id) {
        Menu menu = menuRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Cannot delete. No item with id: " + id));
        menuRepository.delete(menu);
        return "Deleted successfully";
    }
}
