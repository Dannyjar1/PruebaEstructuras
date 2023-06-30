/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.pruebaestructuras;

import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author Usuario
 */
public class GestorTareasCola {
    
     private Queue<Tarea> colaTareas;
    
    public GestorTareasCola() {
        colaTareas = new LinkedList<>();
 
    }
    
    public void agregarTareaCola(String nombre, String descripcion) {
        Tarea tarea = new Tarea(nombre, descripcion);
        colaTareas.add(tarea);
        
    }
    
    public void eliminarTareaCola(String nombre) {
        colaTareas.removeIf(t -> t.getNombre().equals(nombre));
      
    }
    
    public void mostrarTareasCola() {
        System.out.println("Tareas pendientes :");
        for (Tarea tarea : colaTareas) {
            System.out.println("Nombre: " + tarea.getNombre());
            System.out.println("Descripcion: " + tarea.getDescripcion());
        }
    }

    
   
}
