@SuppressWarnings("ALL")
public class Planeta {
    private final double longitudDelDiaEnSegundos;
    private final double longitudDelAñoEnDias;

    public Planeta(double longitudDelDiaEnSegundos, double longitudDelAñoEnDias) {
        this.longitudDelDiaEnSegundos = longitudDelDiaEnSegundos;
        this.longitudDelAñoEnDias = longitudDelAñoEnDias;
    }

    public double getLongitudDelDiaEnSegundos() {
        return longitudDelDiaEnSegundos;
    }

    public double getLongitudDelAñoEnDias() {
        return longitudDelAñoEnDias;
    }

    public double convertirTiempoATierra(double tiempoEnSegundos) {
        return tiempoEnSegundos / longitudDelDiaEnSegundos;
    }
}
