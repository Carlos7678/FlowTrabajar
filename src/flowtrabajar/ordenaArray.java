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
public class ordenaArray {
    public static String ordenaArray(String input) throws NegativoException {
        String[] elementos = input.split(" ");

        // Verificar si se ingresaron valores no numéricos
        for (String elemento : elementos) {
            if (!elemento.matches("\\d+")) {
                throw new NegativoException("Se ingresó un valor no numérico.");
            }
        }

        // Convertir los elementos del array a números enteros
        int[] array = new int[elementos.length];
        for (int i = 0; i < elementos.length; i++) {
            array[i] = Integer.parseInt(elementos[i]);
        }

        // Ordenar el array de manera ascendente
        Arrays.sort(array);

        // Mostrar el array ordenado y su longitud
        return "Array ordenado: " + Arrays.toString(array)+"\nLongitud del array: " + array.length;
    }
}
