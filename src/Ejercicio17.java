import java.util.Arrays;
public class Ejercicio17 {
    public static void main(String[] args) {
        // llenado las dos matrices con numeros reales
        double[][] matriz1 = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };
        double[][] matriz2 = {
                {2.0, 4.0, 6.0},
                {5.0, 7.0, 9.0},
                {8.0, 10.0, 12.0}
        };

        // Calculando la matriz de covarianza
        double[][] covarianza = covarianza(matriz1, matriz2);

        // mostrando la matriz de covarianza por consola
        System.out.println("La Matriz de covarianza es:");
        for (int i = 0; i < covarianza.length; i++) {
            System.out.println(Arrays.toString(covarianza[i]));
        }
    }

    public static double[][] covarianza(double[][] matriz1, double[][] matriz2) {
        int nFilas = matriz1.length;
        int nColumnas = matriz1[0].length;

        double mediaMatriz1 = media(matriz1);
        double mediaMatriz2 = media(matriz2);

        double[][] covarianza = new double[nColumnas][nColumnas];

        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                for (int k = 0; k < matriz2[i].length; k++) {
                    covarianza[j][k] += ((matriz1[i][j] - mediaMatriz1) * (matriz2[i][k] - mediaMatriz2)) / (nFilas - 1);
                }
            }
        }

        return covarianza;
    }

    public static double media(double[][] matriz) {
        int nFilas = matriz.length;
        int nColumnas = matriz[0].length;

        double suma = 0;
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                suma += matriz[i][j];
            }
        }

        return suma / (nFilas * nColumnas);
    }
}