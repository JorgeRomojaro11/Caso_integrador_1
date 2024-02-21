public class Mensaje {
    private String texto;

    public Mensaje(String texto) {
        this.texto = texto;
    }

    public int contarCaracter(char caracter) {
        int count = 0;
        for (char c : texto.toCharArray()) {
            if (c == caracter) {
                count++;
            }
        }
        return count;
    }

    public boolean esPalindromo() {
        String reversed = new StringBuilder(texto).reverse().toString();
        return texto.equals(reversed);
    }

    @Override
    public String toString() {
        return texto;
    }
}