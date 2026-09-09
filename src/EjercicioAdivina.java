import java.util.Scanner;

public class EjercicioAdivina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int numeroIngresado = 0;
        
        System.out.println("Adivina el número secreto (entre 1 y 100):");


        int intentos = 0;


        while (numeroIngresado != numeroSecreto) {

            System.out.println("Ingresa un numero del 1 al 100");
            numeroIngresado = sc.nextInt();
            intentos++;
            if (numeroIngresado < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (numeroIngresado > numeroSecreto) {
                System.out.println("El número secreto es menor.");
        } else {
            System.out.println("¡Felicidades! Has adivinado el número secreto en " + intentos + " intentos.");
        }

            
        }
        
        sc.close();
    }
}
