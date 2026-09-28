package Ejercicio1_centroNotificaciones;

public class SistemaSeguridad {
    private String nombre;
    private CentroMensajeria centro;

    public SistemaSeguridad(String nombre, CentroMensajeria centro) {
        this.nombre = nombre;
        this.centro = centro;
    }

    public void enviarAlerta(String texto, int prioridad) {
        Mensaje mensaje = new Mensaje(nombre, texto, prioridad);
        centro.recibirMensaje(mensaje);
    }
}
