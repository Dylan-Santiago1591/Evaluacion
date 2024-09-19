package com.evaluacion.evaluacion.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.evaluacion.evaluacion.service.tareaService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RequestMapping("/api/v1/tarea")
@RestController
public class tareaController {

    @GetMapping("/")
    public ResponseEntity<Object> findAll() {
        var listaTarea = tareaService.findAll();
        return new ResponseEntity<>(listaTarea, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> findOne(@PathVariable String id){
        var tarea = tareaService.findOne(id);
        return new ResponseEntity<>(tarea, HttpStatus.Ok);
    }
    

}
