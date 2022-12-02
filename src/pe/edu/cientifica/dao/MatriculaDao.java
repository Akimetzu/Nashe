/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cientifica.dao;

import java.util.ArrayList;
import java.util.List;
import pe.edu.cientifica.model.Matricula;

/**
 *
 * @author Alumno
 */
public class MatriculaDao {
    private List<Matricula> lista; 
    
    public MatriculaDao(){
        lista= new ArrayList<>();
    }
    public void add(Matricula matri){
        lista.add(matri);
    }
    public List<Matricula> getLista(){
        return lista;
    }
    public void update(int index, Matricula matri){
        lista.get(index).setNombre(matri.getNombre());
        lista.get(index).setApellido(matri.getApellido());
        lista.get(index).setCarrera(matri.getCarrera());
        lista.get(index).setCiclo(matri.getCiclo());
        lista.get(index).setTurno(matri.getTurno());
        lista.get(index).setFecha(matri.getFecha());
        lista.get(index).setModalidad(matri.getModalidad());
    }
    public void delete(int index){
        lista.remove(index);
    }
    
    public int search(String carrera){
        int index=-1;
        for(int i = 0; i<lista.size(); i++){
            if(lista.get(i).getCarrera().equals(carrera))
                index = i;
        }    
        return index;
    }
}
