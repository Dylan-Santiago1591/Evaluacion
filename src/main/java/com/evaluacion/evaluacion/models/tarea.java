package com.evaluacion.evaluacion.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tarea")
public class tarea {

    @Id
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "idTarea", nullable = false , length = 40)        
    private String idTarea;

    @Column(name= "title", nullable = false , length = 40)
    private String title;

    @Column(name= "dueDate", nullable = false , length = 30)
    private Date dueDate;

    @Column(name= "correoElectronico", nullable = false , length = 40)
    private String correoElectronico;

    @Column(name= "status", nullable = false , length = 17)
    private String status;
}
