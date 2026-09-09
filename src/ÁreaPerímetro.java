import java.util.Scanner;

public class ÁreaPerímetro  {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);   
    
    System.out.print("Ingresa la base del rectángulo:");
    double base = sc.nextDouble();

    System.out.print("Ingresa la altura del rectángulo:");
    double altura = sc.nextDouble();

    System.out.print("Ingresa el radio del círculo: ");
    double radio = sc.nextDouble();

    double areaRectangulo = base * altura;
    double perimetroRectangulo = 2 * (base + altura);
    double areaCirculo = Math.PI * radio * radio;
    double circunferencia = 2 * Math.PI * radio;

    System.out.println("El área del rectángulo es: " + areaRectangulo + "\nEl perímetro del rectángulo es: " + perimetroRectangulo); 
    System.out.println("El área del círculo es: " + areaCirculo + "\nLa circunferencia del círculo es: " + circunferencia);
    
    sc.close();
}
}
