import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ejercicioPlaneta();
        ejercicioRecursos();
        ejercicioMonitoreo();
    }

    public static void ejercicioPlaneta() {
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

    public static void ejercicioRecursos() {
        List<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("Agua", 100.0, 2.0));
        recursos.add(new Recurso("Comida", 200.0, 3.0));

        MonitorRecurso monitorRecurso = new MonitorRecurso(recursos, 50.0);
        monitorRecurso.calcularConsumo();

        EstadisticasRecurso estadisticasRecurso = new EstadisticasRecurso(recursos);
        estadisticasRecurso.mostrarEstadisticas();
    }

    public static void ejercicioMonitoreo() {
        List<VariableAmbiental> variables = new ArrayList<>();
        variables.add(new VariableAmbiental("Temperatura", 20.0));
        variables.add(new VariableAmbiental("Humedad", 50.0));

        AnalizadorEventos analizador = new AnalizadorEventos();
        MonitorAmbiental monitor = new MonitorAmbiental(variables, analizador);
        monitor.monitorearVariables();
    }
}