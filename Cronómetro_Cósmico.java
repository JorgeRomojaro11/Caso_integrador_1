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
    public void mostrarTiempoEnVariosFormatos(double tiempoEnSegundos) {
        double minutos = tiempoEnSegundos / 60;
        double horas = minutos / 60;
        double dias = horas / 24;
        double años = dias / LONGITUD_AÑO_TIERRA_EN_DIAS;

        System.out.println("Tiempo en segundos: " + tiempoEnSegundos);
        System.out.println("Tiempo en minutos: " + minutos);
        System.out.println("Tiempo en horas: " + horas);
        System.out.println("Tiempo en días: " + dias);
        System.out.println("Tiempo en años: " + años);
    }
    public void analizarLimitesDeDatos() {
        System.out.println("Valor máximo para byte: " + Byte.MAX_VALUE);
        System.out.println("Valor máximo para short: " + Short.MAX_VALUE);
        System.out.println("Valor máximo para int: " + Integer.MAX_VALUE);
        System.out.println("Valor máximo para long: " + Long.MAX_VALUE);
        System.out.println("Valor máximo para float: " + Float.MAX_VALUE);
        System.out.println("Valor máximo para double: " + Double.MAX_VALUE);
    }
}