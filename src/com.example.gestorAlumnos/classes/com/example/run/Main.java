/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.run;

/**
 *
 * @author angelssanchez
 */
import com.example.modelos.Alumno;
import java.util.ArrayList;
import java.util.List;



public class Main {
    
    
    
/**
 *
 * @author angelssanchez
 */

    
    
    public static void main(String[] args) {

        List<Alumno> listaAlumnos = new ArrayList<>();

                    
        listaAlumnos.add(new Alumno(1,"1212121222", "Javier", "Molina Cano", "Java", 7, 28));
        listaAlumnos.add(new Alumno(2, "1717456218", "Lillian Eugenia", "Gómez Álvarez","Java", 10, 33));
        listaAlumnos.add(new Alumno(3, "1717328901", "Sixto Naranjoe", "Marín","Java",8.6, 15));
        listaAlumnos.add(new Alumno(5, "1717902145", "Jhony Alberto", "Sáenz Hurtado","Java", 9.5, 15));
        
        
        listaAlumnos.stream().forEach(System.out::println);
    
    }
}
