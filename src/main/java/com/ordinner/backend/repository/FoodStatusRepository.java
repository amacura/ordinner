package com.ordinner.backend.repository;


import com.ordinner.backend.model.FoodStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodStatusRepository extends JpaRepository<FoodStatus,Integer> {
}
