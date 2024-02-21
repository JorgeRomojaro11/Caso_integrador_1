public class CronómetroCósmico {
    public double convertirTiempoATierra(double tiempoEnSegundos, Planeta planeta) {
        return tiempoEnSegundos * planeta.getLongitudDelDiaEnSegundos();
    }

    public void mostrarTiempo(double tiempoEnSegundos) {
        double minutos = tiempoEnSegundos / 60;
        double horas = minutos / 60;
        double dias = horas / 24;
        double años = dias / 365;

        System.out.println("Tiempo en segundos: " + tiempoEnSegundos);
        System.out.println("Tiempo en minutos: " + minutos);
        System.out.println("Tiempo en horas: " + horas);
        System.out.println("Tiempo en días: " + dias);
        System.out.println("Tiempo en años: " + años);
    }
}
