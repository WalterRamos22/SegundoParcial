package SegundoParcial;

public class Main {
    public static void main(String[] args) {
        // Obtener la instancia única de SalonManager
        SalonManager salonManager = SalonManager.obtenerInstancia();

        // Crear salones utilizando la fábrica
        Salon salonConferencias = SalonFactory.crearSalon("conferencias", "Conferencias A", 100);
        Salon salonBanquetes = SalonFactory.crearSalon("banquetes", "Banquetes B", 200);

        // Agregar los salones al administrador
        salonManager.agregarSalon(salonConferencias);
        salonManager.agregarSalon(salonBanquetes);

        // Mostrar los salones disponibles
        System.out.println("Salones disponibles:");
        salonManager.mostrarSalones();

        // Agregar reservaciones
        salonManager.agregarReservacion("Juan Pérez", salonConferencias);
        salonManager.agregarReservacion("María García", salonBanquetes);

        // Mostrar las reservaciones realizadas
        System.out.println("\nReservaciones realizadas:");
        salonManager.mostrarReservaciones();
    }
}