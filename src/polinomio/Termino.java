/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polinomio;

/**
 *
 * @author PC
 */
public class Termino {
    double coeficiente;
    int exponente;
    Termino siguienteTermino;

    public Termino(double coeficiente, int exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
        this.siguienteTermino = null;
    }
}

