import java.util.List;
import java.util.ArrayList;

public class Comunicador {
    private List<Mensaje> mensajes;

    public Comunicador() {
        this.mensajes = new ArrayList<>();
    }

    public Mensaje traducirMensaje(Mensaje mensaje) {
        return mensaje;
    }

    public boolean verificarIntegridad(Mensaje mensaje) {
        return true;
    }

    public void enviarMensaje(Mensaje mensaje) {
        mensajes.add(mensaje);
    }

    public Mensaje recibirMensaje() {
        if (!mensajes.isEmpty()) {
            return mensajes.remove(mensajes.size() - 1);
        }
        return null;
    }
}
