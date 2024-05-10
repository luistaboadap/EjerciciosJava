import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese una base para las piramides: ");
        int numero = scanner.nextInt();

        mostrarPiramides (numero);
    }

    public static void mostrarPiramides(int numero) {
        if (numero > 0) {
            for (int i = numero; i >= 1; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
            mostrarPiramides(numero - 1);
        }
    }
}