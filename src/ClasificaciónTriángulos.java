import java.util.Scanner;

public class ClasificaciónTriángulos  {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    Scanner sc = new Scanner(System.in);    

    System.out.print("Ingresa el valor de a: ");
    double a = sc.nextDouble();

    System.out.print("Ingresa el valor de b: ");
    double b = sc.nextDouble();

    System.out.print("Ingresa el valor de c: ");
    double c = sc.nextDouble();

    boolean esValido = (a + b > c) && (a + c > b) && (b + c > a); 
    
    if (esValido == false ) {
        System.out.println("No es un triángulo válido");

    } else {

        if (a == b && b == c) {
            System.out.println("Equilátero.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isósceles.");
        } else {
            System.out.println("Escaleno.");
        }
   
     }
    sc.close();

    }
}
    