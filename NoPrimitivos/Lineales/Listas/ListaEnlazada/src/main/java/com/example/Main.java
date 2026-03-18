package com.example;

public class Main {
    public static void main(String[] args) {

        ListaTareas lista = new ListaTareas();

        // Agregar tareas normales
        System.out.print("\n--- Agrega tareas normales ---");
        lista.agregarTarea("Estudiar estructuras");
        lista.agregarTarea("Hacer ejercicio");
        lista.agregarTarea("Leer libro");

        System.out.println("\nLista inicial:");
        lista.mostrarTareas();

        // Agregar tarea urgente
        System.out.print("\n--- Agrega tarea urgente ---");
        lista.agregarUrgente("Entregar proyecto");

        System.out.println("\nDespués de agregar urgente:");
        lista.mostrarTareas();

        // Eliminar tarea
        System.out.print("\n--- Elimina tarea ---");
        lista.eliminarTarea("Hacer ejercicio");

        System.out.println("\nDespués de eliminar tarea:");
        lista.mostrarTareas();

        // Buscar tarea
        System.out.print("\n--- Busca tarea ---");
        System.out.println("\n¿Existe 'Leer libro'? " + lista.buscar("Leer libro"));
        System.out.println("¿Existe 'Dormir'? " + lista.buscar("Dormir"));
    }
}