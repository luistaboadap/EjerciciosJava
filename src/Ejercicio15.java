
public class Ejercicio15 {
    public static void main(String[] args) {
        // Crea una matriz de ejemplo
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int maximo = maximo(matriz);
        System.out.println("El maximo elemento de la a}matriz es: " + maximo);
    }

    // La funcion para encontrar el maximo elemento de la matriz
    public static int maximo(int[][] matriz) {
        int maximo = Integer.MIN_VALUE; // Valor mínimo de int

        for (int[] fila : matriz) {
            for (int numero : fila) {
                if (numero > maximo) {
                    maximo = numero;
                }
            }
        }
        return maximo;
    }
}
