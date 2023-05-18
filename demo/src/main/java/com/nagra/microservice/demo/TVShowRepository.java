package com.nagra.microservice.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TVShowRepository extends JpaRepository<TVShow, Long> {
}
