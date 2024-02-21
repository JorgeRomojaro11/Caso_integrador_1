public class Mundo {
    private int[][] terreno;

    public Mundo(int filas, int columnas) {
        terreno = new int[filas][columnas];
    }

    public int[][] getTerreno() {
        return terreno;
    }

    public void setTerreno(int[][] terreno) {
        this.terreno = terreno;
    }
}