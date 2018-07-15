package com.company;
import com.sun.jmx.remote.util.OrderClassLoaders;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        //Pedimos al usuario el tamaño de elementos en el arreglo

        System.out.println("Tamaño de elementos en el arreglo: ");
        int n = lector.nextInt();
        int array[] = new int[n];

        //Mostramos elementos antes del sorting

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.println("Posición de arreglo " + i + " = " + array[i]);
            }
        System.out.println("");
        System.out.println("Elementos después del InsertionSort");
        System.out.println("");
            Insertion o = new Insertion();

            //Iniciamos contadosr de nanosegundos para eficiencia de algoritmo

           long startTime = System.nanoTime();
           o.Insertion(array);
           long endTime = System.nanoTime();
           long deltaTime = endTime - startTime;

           for (int i=0; i<array.length; i++) {
           System.out.println(array[i]);
        }
            //Mostramos en pantalla tiempo transcurrido de algoritmo
            System.out.println("");
            System.out.println("Tiempo en nano segundos de HeapSort para " +n+ " elementos: " +deltaTime);
    }
}
