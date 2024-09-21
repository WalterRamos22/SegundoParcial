package SegundoParcial;

public class SalonBanquetes extends Salon {
    public SalonBanquetes(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Salón de Banquetes: " + nombre + ", Capacidad: " + capacidad);
    }
}