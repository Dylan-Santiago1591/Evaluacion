package com.evaluacion.evaluacion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evaluacion.evaluacion.interfaces.ITarea;
import com.evaluacion.evaluacion.interfaceservices.ITareaService;
import com.evaluacion.evaluacion.models.tarea;



@Service
public class tareaService implements ITareaService {

    @Autowired
    private ITarea data;

    @Override
    public String save(tarea tarea) {
        data.save(tarea);
        return tarea.getIdTarea();
    }

    @Override
    public Optional<tarea> findOne(String id) {
        Optional<tarea> tarea = data.findById(id);
        return tarea;
    }

    @Override
    public static List<tarea> findAll() {
        List<tarea> listaTarea = (List<tarea>) data.findAll();
        return listaTarea;
    }

}
