import java.util.Scanner;
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero: ");
        int numero = scanner.nextInt();

        int suma= calcularSuma(numero);
        System.out.println("La suma desde 1 al "+numero+" es : "+suma);
    }

    public static int calcularSuma(int numero){
        if (numero == 1){
            return 1;
        }
        else{
            return numero+calcularSuma(numero-1);
        }
    }
}
