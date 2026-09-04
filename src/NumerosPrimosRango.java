import java.util.Scanner;

public class NumerosPrimosRango {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        int a = sc.nextInt();

        System.out.print("Número 2: ");
        int b = sc.nextInt();

        int cantidad = 0;
        int suma = 0;
        String listaPrimos = "";

        for (int i = a; i < b; i++) {
            if (i < 2) continue;
            
            boolean esPrimo = true;
            int divisor = 2;

            while (divisor <= Math.sqrt(i) && esPrimo) {
                if (i % divisor == 0) {
                    esPrimo = false;
                }
                divisor++;
            }

                if (esPrimo) {
                    listaPrimos += i + ", ";
                    cantidad++;
                    suma += i;
                }
            
        }

        System.out.println("Primos entre " + a + " y " + b + "; " + listaPrimos);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Suma: " + suma);

        sc.close();
    }
}
