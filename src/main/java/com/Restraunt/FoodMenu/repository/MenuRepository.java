package com.Restraunt.FoodMenu.repository;

import com.Restraunt.FoodMenu.model.Menu;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface MenuRepository extends JpaRepository<Menu, Id> {
    Optional<Menu> findById(int id);

    void deleteById(int id);
}
