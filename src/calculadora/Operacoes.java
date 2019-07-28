package calculadora;

public class Operacoes {

    public static Double Soma(double valor1, double valor2) {

        double resultado = valor1 + valor2;
        return resultado;
    }

    public static Double Menos(double valor1, double valor2) {

        double resultado = valor1 - valor2;
        return resultado;
    }

    public static Double Multiplicacao(double valor1, double valor2) {

        double resultado = valor1 * valor2;
        return resultado;
    }

    public static Double Divisao(double valor1, double valor2) {

        double resultado = valor1 / valor2;
        return resultado;
    }
     public static String addHist(double valor1, double valor2, String resultado , String opera ) {
        String tela = valor1 + " " + opera + " " + " " + valor2 + " " + " = " + resultado;
        return tela;
    }
}
