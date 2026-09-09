import java.util.Scanner;

public class CálculoNómina  {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);    

    System.out.print("Ingresa tu nombre:");
    String nombre = sc.nextLine();

    System.out.print("Ingresa la cantidad de horas trabajadas: ");
    double horas = sc.nextDouble();

    System.out.print("Ingresa el valor de tu salario por hora: ");
    double valorHora = sc.nextDouble();

    double salarioBruto = horas * valorHora;
    double descuentoSS = salarioBruto * 0.08;
    double retencion = salarioBruto * 0.05;
    double salarioNeto = salarioBruto - descuentoSS - retencion;

    System.out.println("Hola: " + nombre + "\nTu cálculo de nómina es: " + "\nSalario Bruto: " + salarioBruto + "\nDescuento Seguridad Social: " + descuentoSS + "\nRetención: " + retencion + "\nSalario Neto: " + salarioNeto);
 
    sc.close();


    }
}