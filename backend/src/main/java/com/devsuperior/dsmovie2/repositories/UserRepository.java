package com.devsuperior.dsmovie2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie2.entities.User;




public interface UserRepository extends JpaRepository< User , Long> {

	User findByEmail(String email);
}
