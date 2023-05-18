/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flowtrabajar;

import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class mediana {
    public static String mediana(int[] numeros) throws NegativoException {
        // Verificar si hay al menos 10 elementos en el array
        if (numeros.length < 10) {
            throw new NegativoException("Se requieren al menos 10 números.");
        }

        // Verificar si se ingresaron valores no numéricos
        for (int numero : numeros) {
            if (numero < 0) {
                throw new NegativoException("Se ingresó un valor negativo.");
            }
        }

        // Ordenar el array de manera ascendente
        Arrays.sort(numeros);

        // Calcular la mediana
        double mediana;
        int n = numeros.length;
        if (n % 2 == 0) {
            mediana = (numeros[n / 2 - 1] + numeros[n / 2]) / 2.0;
        } else {
            mediana = numeros[n / 2];
        }

        return mediana+"";
    }
}