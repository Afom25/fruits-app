package com.example.fruitsapp.repository;

import com.example.fruitsapp.model.fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface fruitRespository extends JpaRepository<fruit,String> {


}
