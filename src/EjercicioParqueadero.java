import java.util.Scanner;
public class EjercicioParqueadero {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Tipo de vehiculo: ");
       System.out.println("1. Carro");
       System.out.println("2. Moto");   
       System.out.println("3. Camioneta");

       String tipoVehiculo = "";
       int tiempoParqueo;
       int tiempoAdicional;
       int valorTotal = 0;

       System.out.println("Ingrese tipo de vehiculo:");
       int vehiculo = sc.nextInt();

       System.out.println("Ingrese tiempo de parqueo en horas:");
       tiempoParqueo = sc.nextInt();            

       switch(vehiculo){
        
        case 1:
            tipoVehiculo = "Carro";
            tiempoAdicional = tiempoParqueo -1;
            if (tiempoParqueo<=1){
                valorTotal = 2000;
            }else{
                valorTotal = 2000 + (tiempoAdicional * 1500);
            }
            break;

        case 2:
            tipoVehiculo = "Moto";
            tiempoAdicional = tiempoParqueo -1;
            if (tiempoParqueo<=1){
                valorTotal = 4000;
            }else{
                valorTotal = 4000 + (tiempoAdicional * 3000);
            }
            break;
        case 3:
            tipoVehiculo = "Camioneta";
            tiempoAdicional = tiempoParqueo -1;
            if (tiempoParqueo<=1){
                valorTotal = 5000;
            }else{
                valorTotal = 5000 + (tiempoAdicional * 4000);
            }
            break;

        default:
            System.out.println("Tipo de vehiculo no valido");
       }

         System.out.println("Tipo de vehiculo: " + tipoVehiculo);
         System.out.println("Tiempo de parqueo: " + tiempoParqueo + " horas");
         System.out.println("Valor total: " + valorTotal);

         sc.close();

    }
}
