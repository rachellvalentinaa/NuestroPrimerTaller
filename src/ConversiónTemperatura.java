import java.util.Scanner;

public class ConversiónTemperatura  {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);    

    System.out.print("Ingresa la temperatura en grados Celsius:");
    double celsius = sc.nextDouble();
    
    double fahrenheit = (celsius * 9/5) + 32;
    double kelvin = celsius + 273.15;

    System.out.printf("Temperatura en celsius: %.2f\n", celsius);
    System.out.printf("Temperatura en farenheit: %.2f\n", fahrenheit);
    System.out.printf("Temperatura en kelvin: %.2f\n", kelvin);

    sc.close();    

    }
}
