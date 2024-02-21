import java.util.List;

public class MonitorRecurso {
    private List<Recurso> recursos;
    private double umbralSeguro;

    public MonitorRecurso(List<Recurso> recursos, double umbralSeguro) {
        this.recursos = recursos;
        this.umbralSeguro = umbralSeguro;
    }

    public void calcularConsumo() {
        for (Recurso recurso : recursos) {
            recurso.consumirRecurso(recurso.getTasaConsumo());
            if (recurso.getNivelActual() < umbralSeguro) {
                System.out.println("Alerta: El recurso " + recurso.getNombre() + " ha caído por debajo del umbral seguro.");
            }
        }
    }
}