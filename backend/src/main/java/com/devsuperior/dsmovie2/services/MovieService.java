package com.devsuperior.dsmovie2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsmovie2.dto.MovieDTO;
import com.devsuperior.dsmovie2.entities.Movie;
import com.devsuperior.dsmovie2.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable){
		Page<Movie> result = repository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
		
	}
	@Transactional(readOnly = true)
	public MovieDTO findById(Long Id){
		Movie result = repository.findById(Id).get();
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
}