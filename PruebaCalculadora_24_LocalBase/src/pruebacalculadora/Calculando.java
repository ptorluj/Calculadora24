/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacalculadora;

/**
 *
 * @author usuario
 */
public class Calculando {

    public double add(double number1, double number2) {
        return number1+number2;
    }

    public double subtract(double number1, double number2) {
        return number1-number2;
    }

    public double multiply(double number1, double number2) {
        return number1*number2;
    }

    public double divide(double number1, double number2) {
        return number1/number2;
    }

    public double resto(double dividendo, double divisor) {
        return dividendo%divisor;
    }

    public double potencia(double base, double esponente) {
        return Math.pow(base, esponente);
    }

    public double factorial(double number1) {
        long factorial = 1;
        for (int i=1;i<=number1;i++) {
            factorial *= i;
        }
        return factorial;
    }
}
