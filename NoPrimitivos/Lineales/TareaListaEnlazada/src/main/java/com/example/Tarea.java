package com.example;

class Tarea {
    String descripcion;
    Tarea siguiente;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.siguiente = null;
    }
}