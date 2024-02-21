public class AnalizadorEventos {
    public String analizar(VariableAmbiental variable) {
        double valor = variable.getValorActual();
        if (esEventoCritico(valor)) {
            return "Evento crítico";
        } else if (esEventoRaro(valor)) {
            return "Evento raro";
        } else {
            return "Normal";
        }
    }

    public boolean esEventoRaro(double valor) {
        return esPrimo((int) valor);
    }

    public boolean esEventoCritico(double valor) {
        return valor > 100;
    }

    private boolean esPrimo(int valor) {
        if (valor <= 1) {
            return false;
        }
        for (int i = 2; i < valor; i++) {
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }
}