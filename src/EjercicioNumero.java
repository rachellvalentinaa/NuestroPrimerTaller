import java.util.Scanner;
public class EjercicioNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero positivo:");
        int numero = sc.nextInt();

        for(int i = 1; i <= 12; i++) {
            System.out.printf("%4d", numero * i);
        }

        System.out.println();

        for(int fila = 1; fila <= numero; fila++){
            for(int columna = 1; columna <= 12; columna++) {
                System.out.printf("%4d", fila * columna);
            }
            System.out.println();
        }

        sc.close();

    }
    
}
