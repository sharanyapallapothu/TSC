package com.nagra.microservice.demo;



import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CharacterRepository extends JpaRepository<Character, TVShow> {

    List<Character> findByID(TVShow ID);
}
