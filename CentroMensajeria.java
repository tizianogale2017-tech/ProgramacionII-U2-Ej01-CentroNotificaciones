package Ejercicio1_centroNotificaciones;

import java.util.ArrayList;
import java.util.List;

public class CentroMensajeria {
    private List<Mensaje> mensajesRecibidos = new ArrayList<>();

    public void recibirMensaje(Mensaje m) {
        mensajesRecibidos.add(m);
        String etiqueta = m.getPrioridad() == 3 ? "URGENTE" : "normal";
        System.out.println("[Centro] Mensaje #" + mensajesRecibidos.size() + " de " + m.getRemitente()
                + " (" + etiqueta + "): " + m.getTexto());
    }

    public int getCantidadMensajes() {
        return mensajesRecibidos.size();
    }
}
