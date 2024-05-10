import java.util.Random;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de fila: ");
        int filas = scanner.nextInt();

        System.out.println("ingrese el numero de columnas: ");
        int columnas = scanner.nextInt();

        double[][] matriz = new double[filas][columnas];

        Random random = new Random();
        mostrarMatriz (matriz,0,0,random);

        for (double[] fila : matriz) {
            for (double numero : fila) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }

    public static void mostrarMatriz(double[][]matriz, int fila,int columna,Random random) {
        if (fila >= matriz.length || columna >= matriz[fila].length) {
            return;
        }

        matriz[fila][columna] = random.nextDouble();
        mostrarMatriz(matriz, fila + 1, columna, random);
        mostrarMatriz(matriz, fila, columna + 1, random);
    }
}