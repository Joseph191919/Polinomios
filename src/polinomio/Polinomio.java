/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polinomio;

/**
 *
 * @author PC
 */
public class Polinomio {

    Termino cabeza;

    public Polinomio() {
        this.cabeza = null;
    }

    public void agregarTermino(double coeficiente, int exponente) {
        Termino nuevoTermino = new Termino(coeficiente, exponente);

        if (cabeza == null) {
            cabeza = nuevoTermino;
            return;
        }

        // Agregar el nuevo término al final de la lista enlazada
        Termino actual = cabeza;
        while (actual.siguienteTermino != null) {
            actual = actual.siguienteTermino;
        }
        actual.siguienteTermino = nuevoTermino;
    }

    public double evaluar(double x) {
        double resultado = 0.0;
        Termino actual = cabeza;

        while (actual != null) {
            resultado += actual.coeficiente * Math.pow(x, actual.exponente);
            actual = actual.siguienteTermino;
        }

        return resultado;
    }

    public void mostrar() {
        Termino actual = cabeza;
        StringBuilder sb = new StringBuilder();

        while (actual != null) {
            if (actual.exponente == 0) {
                sb.append(actual.coeficiente);
            } else if (actual.exponente == 1) {
                sb.append(actual.coeficiente).append("x");
            } else {
                sb.append(actual.coeficiente).append("x^").append(actual.exponente);
            }

            if (actual.siguienteTermino != null) {
                sb.append(" + ");
            }

            actual = actual.siguienteTermino;
        }

        System.out.println(sb.toString());
    }
}