
public class Ejercicio09 {
    public static void main(String[] args) {
        // llenando una matriz
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int fila = matriz.length % 2 == 0 ? matriz.length / 2 : matriz.length / 2 + 1;
        int columna = matriz[0].length % 2 == 0 ? matriz[0].length / 2 : matriz[0].length / 2 + 1;
        System.out.println("El elemento central de la matriz es: " + matriz[fila][columna]);
    }
}