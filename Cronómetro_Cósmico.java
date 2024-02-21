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
}

public class CronómetroCósmico {
    private static final double LONGITUD_DIA_TIERRA_EN_SEGUNDOS = 86400;
    private static final double LONGITUD_AÑO_TIERRA_EN_DIAS = 365.25;

    public double convertirTiempoTierraAPlaneta(double tiempoTierraEnSegundos, Planeta planeta) {
        double diasTierra = tiempoTierraEnSegundos / LONGITUD_DIA_TIERRA_EN_SEGUNDOS;
        double diasPlaneta = diasTierra * (LONGITUD_DIA_TIERRA_EN_SEGUNDOS / planeta.getLongitudDelDiaEnSegundos());
        return diasPlaneta * planeta.getLongitudDelDiaEnSegundos();
    }