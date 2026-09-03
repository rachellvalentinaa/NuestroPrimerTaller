import java.util.Scanner;

public class ValidacionEntradaWhile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int edad = 0;
    
        while (edad < 1 || edad > 120) {
            System.out.println("Ingresa tu edad (1-120): ");
            edad = sc.nextInt();
            if (edad < 1 || edad > 120) {
                System.out.println("Edad inválida, intenta de nuevo");
            }
        }

        String etapa_vida;

        if (edad >= 1 && edad <= 12) {
            etapa_vida = "Niñez";
        }
        
        else if (edad >= 13 && edad <= 17) {
            etapa_vida = "Adolescencia";
        }
        
        else if (edad >= 18 && edad <= 59) {
            etapa_vida = "Adultez";
        }
        
        else {
            etapa_vida = "TERcera edad";
        }

        System.out.println("Su estapa de vida es: " + etapa_vida);

        sc.close();
    }
}
