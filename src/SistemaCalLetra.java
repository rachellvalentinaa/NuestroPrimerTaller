import java.util.Scanner;

public class SistemaCalLetra { 
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    Scanner sc = new Scanner(System.in); 

    System.out.print("Ingresa tu nota(entre 0 y 5): ");
    double nota = sc.nextDouble();

    char letra; //Dato primitivo para almacenar la letra de cada nota
    String descripcion; 

    if (nota >= 4.5) { 
        letra = 'A';
        descripcion = "Excelente";
    } else if (nota >= 4.0) {
        letra = 'B';
        descripcion = "Sobresaliente";
    } else if (nota >= 3.5) {
        letra = 'C';
        descripcion = "Aceptable";
    } else if (nota >= 3.0) {
        letra = 'D';
        descripcion = "Aprobado mínimo";
    } else {
        letra = 'F';
        descripcion = "Reprobado";

    }
    
    System.out.println("Tu nota es: " + nota + " " + letra + " " + descripcion);

    sc.close();

 } 

}
