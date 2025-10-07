
package Calculadora_;

import java.util.Scanner;

/**
 *
 * @author emils
 */
public class CalculadoraMatematica {
     // ATRIBUTOS PRIVADOS
    private double numero1;
    private double numero2;

      // CONSTRUCTOR 
    public CalculadoraMatematica() {
        this.numero1 = 0;
        this.numero2 = 0;
    }

      // MÉTODO PARA ESTABLECER NÚMEROS
     //Permite asignar valores a los atributos numero1 y numero2
    public void establecerNumeros(double n1, double n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }

      // MÉTODOS DE OPERACIONES BÁSICAS
     // Retorna la suma de los dos números 
    public double sumar() {
        return numero1 + numero2;
    }

    // Retorna la resta de los dos números 
    public double restar() {
        return numero1 - numero2;
    }

    // Retorna la multiplicación de los dos números 
    public double multiplicar() {
        return numero1 * numero2;
    }

    //  Lanza una excepción si el divisor es cero
    public double dividir() {
        if (numero2 == 0) {
        System.out.println("Error: No se puede dividir entre cero.");
        return 0;
        }
    // Retorna la división de los dos números
        return numero1 / numero2;
    }

      // MÉTODO PRINCIPAL (MENÚ)
       public static void main(String[] args) {
 
        // Se crea una instancia del objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);
        CalculadoraMatematica calc = new CalculadoraMatematica(); // Se crea una instancia (objeto) 
        int opcion; // Se declara la variable 'opcion' y se lee un número decimal desde el teclado 

        // Realizamos el menu utilizando el bucle do while
        do {
            System.out.println("\n===== CALCULADORA MATEMÁTICA =====");
            System.out.println("1. Ingresar números");
            System.out.println("2. Sumar");
            System.out.println("3. Restar");
            System.out.println("4. Multiplicar");
            System.out.println("5. Dividir");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            // Creamos un switch para el menu
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    double n1 = scanner.nextDouble();
                    
                    System.out.print("Ingrese el segundo número: ");
                    double n2 = scanner.nextDouble();
                    calc.establecerNumeros(n1, n2);
                    break;

                case 2:
                    System.out.println("Resultado de la suma: " + calc.sumar());
                    break;

                case 3:
                    System.out.println("Resultado de la resta: " + calc.restar());
                    break;

                case 4:
                    System.out.println("Resultado de la multiplicación: " + calc.multiplicar());
                    break;

                case 5:
                    System.out.println("Resultado de la división: " + calc.dividir());
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
         // uso del while para verificar
        } while (opcion != 0);
        
        // fin del uso de la clase scanner
        scanner.close();
    }
}