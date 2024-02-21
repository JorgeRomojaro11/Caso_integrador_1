public class Main {
    public static void main(String[] args) {
        Planeta planeta = new Planeta(100000, 100);
        CronómetroCósmico reloj = new CronómetroCósmico();

        double tiempoTierraEnSegundos = 86400;
        double tiempoEnPlaneta = reloj.convertirTiempoATierra(tiempoTierraEnSegundos, planeta);

        System.out.println("Tiempo en el planeta:");
        reloj.mostrarTiempo(tiempoEnPlaneta);

        double tiempoEnTierra = planeta.convertirTiempoATierra(tiempoEnPlaneta);

        System.out.println("Tiempo equivalente en la Tierra:");
        reloj.mostrarTiempo(tiempoEnTierra);
    }
}