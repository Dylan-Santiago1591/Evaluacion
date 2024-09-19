package com.evaluacion.evaluacion.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.evaluacion.evaluacion.models.tarea;



@Repository
public interface ITarea extends JpaRepository<tarea, String> {

}
