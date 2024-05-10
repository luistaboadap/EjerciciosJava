import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // llenando la matriz 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("ingrese el numero escalar: ");
        int escalar = scanner.nextInt();

        int nFilas = matriz.length;
        int nColumnas = matriz[0].length;

        int[][] resultado = new int[nFilas][nColumnas];

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }

        // mostrando los resultados por consola
        System.out.println("Matriz original:");
        for (int[] fila : matriz) {
            System.out.println(Arrays.toString(fila));
        }

        System.out.println("\nLa matriz multiplicado por " + escalar + " es: ");
        for (int[] fila : resultado) {
            System.out.println(Arrays.toString(fila));
        }
    }
}