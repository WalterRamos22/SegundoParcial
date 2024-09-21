package SegundoParcial;

public class Reservacion {
    private String cliente;
    private Salon salonReservado;

    public Reservacion(String cliente, Salon salonReservado) {
        this.cliente = cliente;
        this.salonReservado = salonReservado;
    }

    public void mostrarReservacion() {
        System.out.println("Cliente: " + cliente + " ha reservado el " + salonReservado.getNombre());
    }
}