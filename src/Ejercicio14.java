
import java.util.Arrays;
public class Ejercicio14 {
    public static void main(String[] args) {
        //llenando la amtriz
        int[][] matriz = {
                {0, 2, 3},
                {4, 7, 6},
                {9, 8, 9}
        };

        int numeroFilas = matriz.length;
        int numeroColumnas = matriz[0].length;

        // Inicializando las variables sumaTotal y la variable sumaDiferenciaCuadrados
        double sumaTotal = 0;
        double[] valoresOrdenados = new double[numeroFilas * numeroColumnas];
        double sumaDiferenciasCuadrados = 0;

        // Calcula la suma total y almacena los valores en un array
        int index = 0;
        for (int[] fila : matriz) {
            for (int numero : fila) {
                sumaTotal += numero;
                valoresOrdenados[index] = numero;
                index++;
            }
        }

        // Calcula la media
        double media = sumaTotal / (numeroFilas * numeroColumnas);

        // Ordena los valores de la matriz
        Arrays.sort(valoresOrdenados);

        // Calculando la mediana
        double mediana;
        if (valoresOrdenados.length % 2 == 0) {
            mediana = (valoresOrdenados[valoresOrdenados.length / 2] + valoresOrdenados[(valoresOrdenados.length / 2) - 1]) / 2;
        } else {
            mediana = valoresOrdenados[valoresOrdenados.length / 2];
        }

        // Calcula la desviación estándar
        for (double numero : valoresOrdenados) {
            sumaDiferenciasCuadrados += Math.pow(numero - media, 2);
        }
        double desviacionEstandar = Math.sqrt(sumaDiferenciasCuadrados / (numeroFilas * numeroColumnas));

        // Imprime las estadísticas
        System.out.println("La Media: " + media);
        System.out.println("La Mediana: " + mediana);
        System.out.println("La Desviación estándar: " + desviacionEstandar);
    }
}