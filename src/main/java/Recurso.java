public class Recurso {
    private String nombre;
    private double nivelActual;
    private double tasaConsumo;

    public Recurso(String nombre, double nivelActual, double tasaConsumo) {
        this.nombre = nombre;
        this.nivelActual = nivelActual;
        this.tasaConsumo = tasaConsumo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNivelActual() {
        return nivelActual;
    }

    public double getTasaConsumo() {
        return tasaConsumo;
    }

    public void consumirRecurso(double cantidad) {
        nivelActual -= cantidad;
    }
}