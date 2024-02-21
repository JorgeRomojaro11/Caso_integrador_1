public class VariableAmbiental {
    private String nombre;
    private double valorActual;

    public VariableAmbiental(String nombre, double valorActual) {
        this.nombre = nombre;
        this.valorActual = valorActual;
    }

    public String getNombre() {
        return nombre;
    }

    public double getValorActual() {
        return valorActual;
    }

    public void setValorActual(double valorActual) {
        this.valorActual = valorActual;
    }
}
