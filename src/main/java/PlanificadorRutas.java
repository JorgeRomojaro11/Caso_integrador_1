import java.util.ArrayList;
import java.util.List;

public class PlanificadorRutas {
    private Mundo mundo;

    public PlanificadorRutas(Mundo mundo) {
        this.mundo = mundo;
    }

    public Ruta planificarRuta(Punto inicio, Punto fin) {
        List<Punto> puntos = new ArrayList<>();
        puntos.add(inicio);
        puntos.add(fin);
        return new Ruta(puntos);
    }

    public Ruta optimizarRuta(Ruta ruta) {
        return ruta;
    }
}
