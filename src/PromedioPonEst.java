import java.util.Scanner;

public class PromedioPonEst { 
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in); 
    
    System.out.print("Ingresa la nota 1 (p1): ");
    double p1 = sc.nextDouble();

    System.out.print("Ingresa la nota 2 (p2): ");
    double p2 = sc.nextDouble();

    System.out.print("Ingresa la nota 3 (pf): ");
    double pf = sc.nextDouble();

    double definitiva = (p1 * 0.30) + (p2 * 0.30) + (pf * 0.40);
   
    String estado = (definitiva >= 3.0) ? "Aprobado" : "Reprobado"; // (Operador ternario) ? = if, : = else

    System.out.printf("Tu nota definitiva es: %.2f\n", definitiva); // %.2f = 2 decimales
    System.out.println("Tu estado es: " + estado);

    sc.close();
    }
}  
