package com.Restraunt.FoodMenu.controller;

import com.Restraunt.FoodMenu.model.Menu;
import com.Restraunt.FoodMenu.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.Restraunt.FoodMenu.model.Menu.*;

@RestController
@RequestMapping("/api")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/food")
    public List<Menu> getAllFood(){
        return menuService.getAllFood();
    }

    @GetMapping("/food/{id}")
    public Menu getFood( @PathVariable int id){
        return menuService.getFoodWithId(id);
    }

    @PostMapping("/food")
    public Menu addFoodItem(@RequestBody Menu menu){
        return menuService.addFood(menu);
    }

//    @PutMapping("/food/{id}")
//    public Menu updateFoodItem(@PathVariable int id, @RequestBody Menu menu){
//        Menu.setId(id);
//        return menuService.addFood(menu);
//    }

    @DeleteMapping("/food/{id}")
    public String deleteFoodItem(@PathVariable int id){
        return menuService.deleteFoodWithId(id);
    }
}
