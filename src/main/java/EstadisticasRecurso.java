import java.util.List;

public class EstadisticasRecurso {
    private List<Recurso> recursos;

    public EstadisticasRecurso(List<Recurso> recursos) {
        this.recursos = recursos;
    }

    public void mostrarEstadisticas() {
        for (Recurso recurso : recursos) {
            System.out.println("El recurso " + recurso.getNombre() + " tiene un nivel actual de " + recurso.getNivelActual());
        }
    }
}