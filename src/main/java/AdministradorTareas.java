import java.util.Comparator;
import java.util.List;

public class AdministradorTareas {
    private List<MiembroTripulacion> tripulacion;
    private List<Tarea> tareas;

    public AdministradorTareas(List<MiembroTripulacion> tripulacion, List<Tarea> tareas) {
        this.tripulacion = tripulacion;
        this.tareas = tareas;
    }

    public void asignarTareas() {
        for (Tarea tarea : tareas) {
            MiembroTripulacion miembro = tripulacion.stream()
                    .min(Comparator.comparingInt(m -> m.getTareasAsignadas().size()))
                    .orElseThrow(() -> new RuntimeException("No hay miembros de la tripulación disponibles"));
            miembro.getTareasAsignadas().add(tarea);
            System.out.println("Asignada la tarea " + tarea.getNombre() + " a " + miembro.getNombre());
        }
    }

    public void ajustarAsignacion() {
        for (MiembroTripulacion miembro : tripulacion) {
            while (miembro.getTareasAsignadas().size() > tripulacion.stream()
                    .mapToInt(m -> m.getTareasAsignadas().size()).average().orElse(0)) {
                Tarea tarea = miembro.getTareasAsignadas().remove(0);
                MiembroTripulacion otroMiembro = tripulacion.stream()
                        .min(Comparator.comparingInt(m -> m.getTareasAsignadas().size()))
                        .orElseThrow(() -> new RuntimeException("No hay miembros de la tripulación disponibles"));
                otroMiembro.getTareasAsignadas().add(tarea);
                System.out.println("Movida la tarea " + tarea.getNombre() + " de " + miembro.getNombre() + " a " + otroMiembro.getNombre());
            }
        }
    }
}