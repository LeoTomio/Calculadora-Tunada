/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

public class OperacoesAvancadas {

    public static Double Potencia2(double valor1) {

        double resultado = valor1 * valor1;
        return resultado;
    }

    public static Double Potencia3(double valor1) {

        double resultado = valor1 * valor1 * valor1;
        return resultado;
    }

    public static Double PotenciaX(double valor1, double valor2) {

        double resultado = Math.pow(valor1, valor2);
        return resultado;
    }

    public static Double RaizQuadrada(double valor1) {

        double resultado = Math.sqrt(valor1);
        
        return resultado;
    }

    public static String addHistorico(double valor1, String resultado, String opera) {
        String tela = valor1 + " " + opera + " " + " = " + resultado;
        return tela;
    }
     
}
