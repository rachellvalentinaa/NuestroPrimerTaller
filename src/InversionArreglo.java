import java.util.Scanner;
public class InversionArreglo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = sc.nextInt();
        int[] arreglo = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            arreglo[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arreglo[i] + ", ");    
        }

        sc.close();
        
    }
}
