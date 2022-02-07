import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        int numero = askForNumber();
        boolean resultat = showIfEvenOrOdd(numero);


    }

    private static int askForNumber() {
        System.out.println("Introdueix un numero enter: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();

    }

    private static boolean showIfEvenOrOdd( int numero) {
        if (numero % 2 == 0){
            System.out.println("El numero es par.");
            return true;
        }else{
            System.out.println("El numero es impar.");
            return false;
        }
    }
}
