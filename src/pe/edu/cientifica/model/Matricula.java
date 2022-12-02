/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cientifica.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 *
 * @author Alumno
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Matricula {
    private String nombre;
    private String apellido;
    private String carrera;
    private int ciclo;
    private String turno;
    private String fecha;
    private String modalidad;
}
