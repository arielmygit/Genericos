package org.example;

public class Comida {
    private String nombre;
    private Boolean procesada;

    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                ", procesada=" + procesada +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getProcesada() {
        return procesada;
    }

    public void setProcesada(Boolean procesada) {
        this.procesada = procesada;
    }

    public Comida(String nombre, Boolean procesada) {
        this.nombre = nombre;
        this.procesada = procesada;
    }

    public Comida() {
    }
}
