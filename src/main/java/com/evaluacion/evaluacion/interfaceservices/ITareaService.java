package com.evaluacion.evaluacion.interfaceservices;

import java.util.List;
import java.util.Optional;

import com.evaluacion.evaluacion.models.tarea;

public interface ITareaService {

    public String save (tarea tarea);
    
    public Optional<tarea> findOne(String id);

    public List<tarea> findAll();
}
