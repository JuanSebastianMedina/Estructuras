package com.example;

class ListaTareas {
    private Tarea cabeza;

    public ListaTareas() {
        cabeza = null;
    }

    // Agregar al final
    public void agregarTarea(String descripcion) {
        Tarea nueva = new Tarea(descripcion);
        if (cabeza == null) {
            cabeza = nueva;
            return;
        }
        Tarea actual = cabeza;
        while (actual.siguiente != null) {
            actual = actual.siguiente;
        }
        actual.siguiente = nueva;
    }

    // ⚡ Agregar al inicio (urgente)
    public void agregarUrgente(String descripcion) {
        Tarea nueva = new Tarea(descripcion);
        nueva.siguiente = cabeza;
        cabeza = nueva;
    }

    // Eliminar tarea
    public void eliminarTarea(String descripcion) {
        if (cabeza == null) return;
        if (cabeza.descripcion.equals(descripcion)) {
            cabeza = cabeza.siguiente;
            return;
        }
        Tarea actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.descripcion.equals(descripcion)) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
    }

    // Buscar tarea
    public boolean buscar(String descripcion) {
        Tarea actual = cabeza;
        while (actual != null) {
            if (actual.descripcion.equals(descripcion)) {
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    // Mostrar lista
    public void mostrarTareas() {
        Tarea actual = cabeza;
        while (actual != null) {
            System.out.print("[" + actual.descripcion + "] -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
}