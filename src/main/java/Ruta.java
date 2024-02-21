import java.util.List;

public class Ruta {
    private List<Punto> puntos;

    public Ruta(List<Punto> puntos) {
        this.puntos = puntos;
    }

    public List<Punto> getPuntos() {
        return puntos;
    }

    public void setPuntos(List<Punto> puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Ruta{" +
                "puntos=" + puntos +
                '}';
    }
}