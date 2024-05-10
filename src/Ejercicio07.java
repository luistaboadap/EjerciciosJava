import java.util.Random;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de fila: ");
        int filas = scanner.nextInt();

        System.out.println("ingrese el numero de columnas: ");
        int columnas = scanner.nextInt();

        // creando la matriz

        double[][] matrizComplejo = new double[filas][columnas*2];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas * 2; j += 2) {
                matrizComplejo[i][j] = random.nextDouble() * 10 - 5;
                matrizComplejo[i][j + 1] = random.nextDouble() * 10 - 5;
            }
        }
        // Imprime la matriz de números complejos
        for (double[] fila : matrizComplejo) {
            for (int j = 0; j < fila.length; j += 2) {
                System.out.print(fila[j] + " + " + fila[j + 1] + "i ");
            }
            System.out.println();
        }
    }
}