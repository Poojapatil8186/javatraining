package com.example.onetomanydemo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface cartRepository extends JpaRepository<cart, Integer> {

}
