import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testEjercicioPlaneta() {
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

    @Test
    void testEjercicioRecursos() {
        List<Recurso> recursos = new ArrayList<>();
        recursos.add(new Recurso("Agua", 100.0, 2.0));
        recursos.add(new Recurso("Comida", 200.0, 3.0));

        MonitorRecurso monitorRecurso = new MonitorRecurso(recursos, 50.0);
        monitorRecurso.calcularConsumo();

        EstadisticasRecurso estadisticasRecurso = new EstadisticasRecurso(recursos);
        estadisticasRecurso.mostrarEstadisticas();
    }

    @Test
    void testEjercicioMonitoreo() {
        List<VariableAmbiental> variables = new ArrayList<>();
        variables.add(new VariableAmbiental("Temperatura", 20.0));
        variables.add(new VariableAmbiental("Humedad", 50.0));

        AnalizadorEventos analizador = new AnalizadorEventos();
        MonitorAmbiental monitor = new MonitorAmbiental(variables, analizador);
        monitor.monitorearVariables();
    }

    @Test
    void testEjercicioTareas() {
        MiembroTripulacion miembro1 = new MiembroTripulacion("Miembro 1");
        MiembroTripulacion miembro2 = new MiembroTripulacion("Miembro 2");

        Tarea tarea1 = new Tarea("Tarea 1", 10);
        Tarea tarea2 = new Tarea("Tarea 2", 20);

        List<MiembroTripulacion> tripulacion = Arrays.asList(miembro1, miembro2);
        List<Tarea> tareas = Arrays.asList(tarea1, tarea2);

        AdministradorTareas administrador = new AdministradorTareas(tripulacion, tareas);

        administrador.asignarTareas();
        administrador.ajustarAsignacion();
    }

    @Test
    void testEjercicioRutas() {
        Mundo mundo = new Mundo(10, 10);
        Simulador simulador = new Simulador(mundo);
        simulador.simularTerreno();
        System.out.println("Terreno simulado");
        simulador.simularObstaculos();
        System.out.println("Obstáculos simulados");

        PlanificadorRutas planificador = new PlanificadorRutas(mundo);
        Ruta ruta = planificador.planificarRuta(new Punto(1, 5), new Punto(8, 9));
        System.out.println("Ruta planificada: " + ruta);
        Ruta rutaOptimizada = planificador.optimizarRuta(ruta);
        System.out.println("Ruta optimizada: " + rutaOptimizada);
    }

    @Test
    void testEjercicioMensaje() {
        Comunicador comunicador = new Comunicador();
        Mensaje mensaje = new Mensaje("trabajo terminado");

        System.out.println("El mensaje es un palíndromo: " + mensaje.esPalindromo());
        System.out.println("El mensaje tiene " + mensaje.contarCaracter('a') + " caracteres 'a'");

        comunicador.enviarMensaje(mensaje);
        Mensaje mensajeRecibido = comunicador.recibirMensaje();

        System.out.println("Mensaje recibido: " + mensaje);
    }
}