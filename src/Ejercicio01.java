public class Ejercicio01 {
    public static void main(String[] args) {
        numeroPares (1);

    }
    // funcion
    public  static void numeroPares(int numero){
        if(numero>100){
            return ;
        }
        if(numero %2==0){
            System.out.println("Numero Par: " + numero);
        }
        numeroPares(numero+1);
    }
}
