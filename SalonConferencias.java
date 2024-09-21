package SegundoParcial;

public class SalonConferencias extends Salon {
    public SalonConferencias(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Salón de Conferencias: " + nombre + ", Capacidad: " + capacidad);
    }
}