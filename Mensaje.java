package Ejercicio1_centroNotificaciones;

public class Mensaje {
    private String remitente;
    private String texto;
    private int prioridad;

    public Mensaje(String remitente, String texto, int prioridad) {
        if (prioridad < 1 || prioridad > 3) {
            throw new IllegalArgumentException("La prioridad debe estar entre 1 (baja) y 3 (alta).");
        }
        this.remitente = remitente;
        this.texto = texto;
        this.prioridad = prioridad;
    }

    public String getRemitente() {
        return remitente;
    }

    public String getTexto() {
        return texto;
    }

    public int getPrioridad() {
        return prioridad;
    }
}
