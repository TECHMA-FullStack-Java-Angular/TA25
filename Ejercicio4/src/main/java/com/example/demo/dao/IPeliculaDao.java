package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.dto.Pelicula;

public interface IPeliculaDao extends JpaRepository<Pelicula,Integer>{

}
