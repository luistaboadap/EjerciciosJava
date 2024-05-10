import java.util.Random;
public class Ejercicio13 {
    public static void main(String[] args) {

        int[][] matriz = new int[100][100];

        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
            }
        }
        for (int[] fila : matriz) {
            for (int numero : fila) {
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}
