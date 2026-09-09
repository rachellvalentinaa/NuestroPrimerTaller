import java.util.Scanner;
public class EjercicioSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo:");
        int numero = sc.nextInt();

        int sumaNaturales = 0;

        for(int i = 1; i <= numero; i++) {
            sumaNaturales += i;
        }

        int formulaNaturales= numero* (numero+1)/2;


        int sumaPares = 0;
        for(int i = 1; i <= numero; i++) {
            sumaPares += 2 * i;
        }   

        int formulaPares= numero* (numero+1);


        int sumaCuadrados = 0;
        for(int i = 1; i <= numero; i++) {
            sumaCuadrados += i * i;
        }

        int formulaCuadrados= numero* (numero+1)* (2*numero+1)/6;

        System.out.println("Suma de los " + numero + " primeros números naturales: " + sumaNaturales);
        System.out.println("Suma de los " + numero + " primeros números naturales (fórmula): " + formulaNaturales);
        System.out.println("Suma de los " + numero + " primeros números pares: " + sumaPares);
        System.out.println("Suma de los " + numero + " primeros números pares (fórmula): " + formulaPares);
        System.out.println("Suma de los cuadrados de los " + numero + " primeros números naturales: " + sumaCuadrados);
        System.out.println("Suma de los cuadrados de los " + numero + " primeros números naturales (fórmula): " + formulaCuadrados);

        sc.close();
    }
}
