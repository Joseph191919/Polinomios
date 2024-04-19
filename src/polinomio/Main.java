/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polinomio;

/**
 *
 * @author PC
 */
  import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un objeto Polinomio
        Polinomio polinomio = new Polinomio();

        System.out.println("Introduce el número de términos en el polinomio:");
        int numTerminos = scanner.nextInt();

        // Leer los términos del polinomio
        for (int i = 0; i < numTerminos; i++) {
            System.out.println("Introduce el coeficiente del término:");
            double coeficiente = scanner.nextDouble();
            System.out.println("Introduce el exponente del término:");
            int exponente = scanner.nextInt();

            // Agregar el término al polinomio
            polinomio.agregarTermino(coeficiente, exponente);
        }

        // Mostrar el polinomio
        System.out.println("\nPolinomio ingresado:");
        polinomio.mostrar();

        // Evaluar el polinomio para valores de x de 0.0 a 5.0 en pasos de 0.5
        System.out.println("\nTabla de valores:");
        for (double x = 0.0; x <= 5.0; x += 0.5) {
            double y = polinomio.evaluar(x);
            System.out.printf("x = %.1f, y = %.2f\n", x, y);
        }
    }
}