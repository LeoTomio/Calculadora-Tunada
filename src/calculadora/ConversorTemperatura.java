package calculadora;

public class ConversorTemperatura {

    public static Double KeltoFar(double valor1) {

        double resultado = 1.8 * (valor1 - 273) + 32;
        return resultado;
    }

    public static Double KeltoCel(double valor1) {

        double resultado = valor1 - 273;
        return resultado;
    }

    public static Double FartoKel(double valor1) {

        double resultado = (valor1 + 459) * 5 / 9;
        return resultado;
    }

    public static Double FartoCel(double valor1) {

        double resultado = (valor1 - 32) / 1.8;
        return resultado;
    }

    public static Double CeltoFar(double valor1) {

        double resultado = (1.8 * valor1) + 32;
        return resultado;
    }

    public static Double CeltoKel(double valor1) {

        double resultado = valor1 + 273;
        return resultado;
    }

    public static String HistAdd(double valor1, String resultado, String opera,String operaF) {
        String tela = valor1 + " " + opera + resultado + operaF;
        return tela;
    }
}
