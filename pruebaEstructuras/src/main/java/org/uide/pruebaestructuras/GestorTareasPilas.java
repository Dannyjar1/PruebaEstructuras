/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.pruebaestructuras;


import java.util.Stack;

/**
 *
 * @author Usuario
 */
class GestorTareasPilas {
    private Stack<Tarea> pilaTareas;
    
    
    public GestorTareasPilas() {
        pilaTareas = new Stack<>();  
        
    }
     
     
    public void agregarTareaPila(String nombre, String descripcion) {
        Tarea tarea = new Tarea(nombre, descripcion);
        pilaTareas.push(tarea);
        
    }
     
    public void eliminarTareaPila(String nombre) {
        pilaTareas.removeIf(t -> t.getNombre().equals(nombre));
    }
    
    public void mostrarTareasPila() {
        System.out.println("Tareas pendientes :");
        for (Tarea tarea : pilaTareas) {
            System.out.println("Nombre: " + tarea.getNombre());
            System.out.println("Descripcion: " + tarea.getDescripcion());
        }
    }
    
}
