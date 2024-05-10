import java.util.stream.IntStream;
public class Ejercicio16 {
    public static void main(String[] args) {
        // llenando una matriz
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sumaMaxima = sumaMaximaSubmatriz(matriz);
        System.out.println("La suma de la submatriz más grande es: " + sumaMaxima);
    }

    // la funcion para la sub matriz que tenga la suma mas alta
    public static int sumaMaximaSubmatriz(int[][] matriz) {
        int sumaMaxima = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaMaxima = Math.max(sumaMaxima, sumaSubmatriz(matriz, i, j));
            }
        }

        return sumaMaxima;
    }

    // Función para calcular la suma de la submatriz con tamaño 2x2 o 3x3
    public static int sumaSubmatriz(int[][] matriz, int i, int j) {
        int suma = 0;

        for (int fila = i; fila < i + 2 && fila < matriz.length; fila++) {
            for (int columna = j; columna < j + 2 && columna < matriz[fila].length; columna++) {
                suma += matriz[fila][columna];
            }
        }

        return suma;
    }
}