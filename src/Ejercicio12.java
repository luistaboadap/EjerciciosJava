public class Ejercicio12 {
    public static void main(String[] args) {

        // llenado una matriz de tamaño 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int numeroFilas = matriz.length;
        int numeroColumnas = matriz[0].length;

        // declarando e inicializando la variable suma

        int suma = 0;
        for (int i = 0; i < numeroFilas; i++) {
            for (int j = 0; j < numeroColumnas; j++) {
                suma += matriz[i][j];
            }
        }
        // calculando la media de los elementos de la matriz

        double media = (double) suma / (numeroFilas * numeroColumnas);

        System.out.println("La media de los elementos de la matriz es: " + media);
    }
}
