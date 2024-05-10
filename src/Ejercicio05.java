import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el numero de la tabla que desea ver: ");
        int numero = scanner.nextInt();

        tablaMultiplicar (numero);
    }

    public static void tablaMultiplicar(int numero) {

        for (int i = 1; i <=12 ; i++) {
                System.out.println(numero+" X " +i+ "= "+(numero*i));
            }
    }
}