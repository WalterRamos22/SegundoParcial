package SegundoParcial;

// Clase abstracta para Salon
abstract class Salon {
    protected String nombre;
    protected int capacidad;

    public String getNombre() {
        return nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public abstract void mostrarDetalles();
}