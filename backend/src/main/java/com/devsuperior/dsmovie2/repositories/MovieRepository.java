package com.devsuperior.dsmovie2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie2.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
