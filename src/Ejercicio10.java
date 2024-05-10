import java.util.Arrays;
public class Ejercicio10 {
    public static void main(String[] args) {

        // llenando las matrices
        // matriz A
        int[][] matriz1 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // matriz B
        int[][] matriz2 = {
                {7, 8, 9},
                {10, 11, 12},
                {13, 14, 15}
        };

        int nFilas1 = matriz1.length;
        int nColumnas1 = matriz1[0].length;
        int nFilas2 = matriz2.length;
        int nColumnas2 = matriz2[0].length;

        int nFilasResultante = Math.max(nFilas1, nFilas2);
        int nColumnasResultante = Math.max(nColumnas1, nColumnas2);

        int[][] suma = new int[nFilasResultante][nColumnasResultante];

        for (int i = 0; i < nFilasResultante; i++) {
            for (int j = 0; j < nColumnasResultante; j++) {
                if (i < nFilas1 && j < nColumnas1 && i < nFilas2 && j < nColumnas2) {
                    suma[i][j] = matriz1[i][j] + matriz2[i][j];
                } else if (i >= nFilas1 || j >= nColumnas1) {
                    suma[i][j] = matriz2[i][j];
                } else {
                    suma[i][j] = matriz1[i][j];
                }
            }
        }

        // Imprime la matriz resultante
        System.out.println("Matriz A:");
        for (int[] fila : matriz1) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();

        System.out.println("Matriz B:");
        for (int[] fila : matriz2) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.println();

        System.out.println("La suma de la matrices es:");
        for (int[] fila : suma) {
            System.out.println(Arrays.toString(fila));
        }
    }
}