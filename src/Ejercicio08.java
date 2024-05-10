import java.util.Random;
import java.util.Scanner;


public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();
        System.out.print("Ingrese la profundidad: ");
        int profundidad = scanner.nextInt();

        // Crea una matriz de matrices
        double[][][] matrizMatrices = new double[filas][columnas][profundidad];

        Random random = new Random();
        rellenarMatrizMatrices(matrizMatrices, random);

        // Imprime la matriz de matrices
        System.out.println("La matriz de matrices es: ");
        for (double[][] plano : matrizMatrices) {
            for (double[] fila : plano) {
                for (double numero : fila) {
                    System.out.print(numero + " ");
                }
                System.out.println();
            }
            System.out.println(); // Para separar las capas de la matriz de matrices
        }
    }

    public static void rellenarMatrizMatrices(double[][][] matrizMatrices, Random random) {
        for (int i = 0; i < matrizMatrices.length; i++) {
            for (int j = 0; j < matrizMatrices[i].length; j++) {
                for (int k = 0; k < matrizMatrices[i][j].length; k++) {
                    matrizMatrices[i][j][k] = random.nextDouble();
                }
            }
        }
    }
}