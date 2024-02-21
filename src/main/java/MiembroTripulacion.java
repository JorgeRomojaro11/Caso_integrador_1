import java.util.ArrayList;
import java.util.List;

public class MiembroTripulacion {
    private String nombre;
    private boolean disponibilidad;
    private List<Tarea> tareasAsignadas;

    public MiembroTripulacion(String nombre) {
        this.nombre = nombre;
        this.disponibilidad = true;
        this.tareasAsignadas = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public List<Tarea> getTareasAsignadas() {
        return tareasAsignadas;
    }

    public void setTareasAsignadas(List<Tarea> tareasAsignadas) {
        this.tareasAsignadas = tareasAsignadas;
    }
}
