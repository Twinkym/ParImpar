import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {
        int numero = askForNumber();
        int resultat = operation(numero);
        showIfEvenOrOdd(resultat);
    }

    private static int askForNumber() {
        System.out.println("Introdueix un numero enter: ");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();

    }

    private static int operation(int numero) {
        if (numero % 2 == 0) {
            return (1);
        } else {
            return (2);
        }

    }

    private static void showIfEvenOrOdd( int resultat) {
        if (resultat == 1){
            System.out.println("El numero es par.");
        }else{
            System.out.println("El numero es impar.");
        }
    }
}
