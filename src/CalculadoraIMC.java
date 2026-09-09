import java.util.Scanner;

public class CalculadoraIMC  {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in); 

    System.out.print("Ingresa tu peso: ");
    double peso = sc.nextDouble();

    System.out.print("Ingresa tu estatura: ");
    double estatura = sc.nextDouble();

    double imc = peso / (estatura * estatura);

    String categoria; // Declarar la variable 

    if (imc < 18.5) {
        categoria = "Bajo peso";
    } else if (imc <= 24.9) {
        categoria = "Peso normal";
    } else if (imc <= 29.9) {
        categoria = "Sobrepeso";
    } else {
        categoria = "Obesidad";
    }

    System.out.printf("Tu IMC es: %.2f\n ", imc);
    System.out.println("Tu categoría es: " + categoria);
    
    sc.close();
 }    

}