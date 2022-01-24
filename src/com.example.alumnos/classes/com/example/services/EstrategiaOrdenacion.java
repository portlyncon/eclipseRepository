package com.example.services;


import com.example.modelos.Alumno;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author angelssanchez
 */
public interface EstrategiaOrdenacion {
    
    
    enum Sentido{
        
        DESC,
        ASC;
    }
  
    default public Comparator<Alumno> getAlgoritmo(){
        
        return getAlgoritmo(Sentido.ASC);
    }
    public  Comparator<Alumno> getAlgoritmo(Sentido sentido);
    
    
    
    
}
