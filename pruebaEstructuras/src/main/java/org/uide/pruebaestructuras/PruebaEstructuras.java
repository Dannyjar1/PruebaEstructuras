/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.uide.pruebaestructuras;

/**
 *
 * @author Usuario
 */
public class PruebaEstructuras {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("-------------COLA----------------");
        GestorTareasCola gestorCola = new GestorTareasCola();
        
        gestorCola.agregarTareaCola("Tarea 1", "Deber de programacion web");
        gestorCola.agregarTareaCola("Tarea 2", "Deber de historia");
        gestorCola.agregarTareaCola("Tarea 3", "Deber de redes");
        gestorCola.mostrarTareasCola();
        gestorCola.eliminarTareaCola("Tarea 2");
        gestorCola.mostrarTareasCola();
       
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("-------------LISTA---------------");
        GestorTareasLista gestorLista = new GestorTareasLista();
        
        gestorLista.agregarTareaLista("Tarea 4", "Deber de base de datos");
        gestorLista.agregarTareaLista("Tarea 5", "Deber de ingles");
        gestorLista.agregarTareaLista("Tarea 6", "Deber de estructura de datos");
        gestorLista.mostrarTareasLista();
        gestorLista.eliminarTareaLista("Tarea 5");
        gestorLista.mostrarTareasLista();
        
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("-------------PILAS---------------");
        GestorTareasPilas gestorPilas = new GestorTareasPilas();

        gestorPilas.agregarTareaPila("Tarea 7", "Deber de redes ");
        gestorPilas.agregarTareaPila("Tarea 8", "Deber de programacion avanzada ");
        gestorPilas.agregarTareaPila("Tarea 9", "Deber de educacion fisica");
        gestorPilas.mostrarTareasPila();
        gestorPilas.eliminarTareaPila("Tarea 8");
        gestorPilas.mostrarTareasPila();
        
    }
}

