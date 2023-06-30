/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uide.pruebaestructuras;

import java.util.LinkedList;


/**
 *
 * @author Usuario
 */
public class GestorTareasLista {
    private LinkedList<Tarea> listaTareas;

    public GestorTareasLista() {
        listaTareas = new LinkedList<>();
    }

    public void agregarTareaLista(String nombre, String descripcion) {
        Tarea tarea = new Tarea(nombre, descripcion);
        listaTareas.add(tarea);
    }

    public void eliminarTareaLista(String nombre) {
        listaTareas.removeIf(t -> t.getNombre().equals(nombre));
    }
    
    public void mostrarTareasLista() {
        System.out.println("Tareas pendientes :");
        for (Tarea tarea : listaTareas) {
            System.out.println("Nombre: " + tarea.getNombre());
            System.out.println("Descripcion: " + tarea.getDescripcion());
        }
    }

  
    
}
