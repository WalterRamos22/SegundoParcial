package SegundoParcial;

public class SalonFactory {
    public static Salon crearSalon(String tipo, String nombre, int capacidad) {
        switch (tipo.toLowerCase()) {
            case "conferencias":
                return new SalonConferencias(nombre, capacidad);
            case "banquetes":
                return new SalonBanquetes(nombre, capacidad);
            default:
                throw new IllegalArgumentException("Tipo de salón desconocido: " + tipo);
        }
    }
}