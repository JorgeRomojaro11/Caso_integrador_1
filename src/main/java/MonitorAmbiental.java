import java.util.List;

import java.util.List;

public class MonitorAmbiental {
    private List<VariableAmbiental> variables;
    private AnalizadorEventos analizador;

    public MonitorAmbiental(List<VariableAmbiental> variables, AnalizadorEventos analizador) {
        this.variables = variables;
        this.analizador = analizador;
    }

    public void monitorearVariables() {
        for (VariableAmbiental variable : variables) {
            String resultado = analizador.analizar(variable);
            System.out.println("Variable: " + variable.getNombre() + ", Valor: " + variable.getValorActual() + ", Resultado del análisis: " + resultado);
        }
    }
}
