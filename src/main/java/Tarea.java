public class Tarea {
    private String nombre;
    private int cargaTrabajo;

    public Tarea(String nombre, int cargaTrabajo) {
        this.nombre = nombre;
        this.cargaTrabajo = cargaTrabajo;
    }

    public Tarea(String testTarea) {
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getCargaTrabajo() {
        return cargaTrabajo;
    }

    public void setCargaTrabajo(int cargaTrabajo) {
        this.cargaTrabajo = cargaTrabajo;
    }
}
