package SegundoParcial;

import java.util.ArrayList;
import java.util.List;

public class SalonManager {
    private static SalonManager instanciaUnica;
    private List<Salon> salones;
    private List<Reservacion> reservaciones;

    private SalonManager() {
        salones = new ArrayList<>();
        reservaciones = new ArrayList<>();
    }

    public static synchronized SalonManager obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new SalonManager();
        }
        return instanciaUnica;
    }

    public void agregarSalon(Salon salon) {
        salones.add(salon);
    }

    public void agregarReservacion(String cliente, Salon salon) {
        Reservacion reservacion = new Reservacion(cliente, salon);
        reservaciones.add(reservacion);
    }

    public void mostrarSalones() {
        for (Salon salon : salones) {
            salon.mostrarDetalles();
        }
    }

    public void mostrarReservaciones() {
        for (Reservacion reservacion : reservaciones) {
            reservacion.mostrarReservacion();
        }
    }
}
