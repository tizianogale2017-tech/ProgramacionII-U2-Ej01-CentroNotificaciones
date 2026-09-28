package Ejercicio1_centroNotificaciones;

public class Main {
    public static void main(String[] args) {
        CentroMensajeria centro = new CentroMensajeria();
        SistemaSeguridad seguridad = new SistemaSeguridad("SistemaSeguridad", centro);

        seguridad.enviarAlerta("Intento de acceso no autorizado en el servidor", 3);
        seguridad.enviarAlerta("Contraseña próxima a vencer", 1);

        System.out.println("Mensajes procesados por el centro: " + centro.getCantidadMensajes());
    }
}
