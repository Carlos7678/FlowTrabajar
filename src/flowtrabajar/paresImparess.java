/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flowtrabajar;

/**
 *
 * @author Alumno
 */
import javax.swing.JOptionPane;

public class paresImparess {

    public static String mostrarParesImpares(int[] numeros) throws NegativoException {
        int numMax = Integer.MIN_VALUE;
        int numMin = Integer.MAX_VALUE;

        StringBuilder pares = new StringBuilder("Números pares:\n");
        StringBuilder impares = new StringBuilder("Números impares:\n");

        for (int num : numeros) {
            if (num % 2 == 0) {
                pares.append(num).append(" ");
            } else {
                impares.append(num).append(" ");
            }

            if (num > numMax) {
                numMax = num;
            }

            if (num < numMin) {
                numMin = num;
            }

            if (num < 0) {
                throw new NegativoException();
            }
        }

        return "Pares: " + pares.toString() + "Impares: " + impares.toString();
    }
}

class NegativoException extends Exception {

    public NegativoException() {
        super("Se ha introducido un valor negativo.");
    }
}
