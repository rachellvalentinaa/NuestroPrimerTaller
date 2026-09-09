import java.util.Scanner;

public class TiempoViaje {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
    Scanner sc = new Scanner(System.in); 
    
    System.out.print("Ingresa los minutos de viaje: ");
    int minutos = sc.nextInt();

    int segundosTotales = minutos * 60;

    int horas = minutos / 60;
    int minResto = minutos % 60;
    int segResto = segundosTotales % 60;
    
    System.out.println("El tiempo total de viaje es: " + horas + " horas, " + minResto + " minutos y " + segResto + " segundos");
    System.out.println(segundosTotales + " segundos");

    sc.close();
        
    }
}