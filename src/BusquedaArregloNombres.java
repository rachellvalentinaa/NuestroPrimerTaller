import java.util.Scanner;

public class BusquedaArregloNombres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arreglo = new String[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el nombre del paciente " + (i+1) + ": ");
            arreglo[i] = sc.nextLine();
        }

        System.out.println("Registrados exitosamente");
        System.out.println();

        System.out.print("Ingrese el nombre del paciente a buscar: ");
        String nombreBuscado = sc.nextLine();
        System.out.println();

        for (int i = 0; i < 8; i++) {
            if (arreglo[i].equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Paciente encontrado en la posición " + (i+1));
                System.out.println();
                return;
            }
        }

        System.out.println("Paciente no encontrado");

        System.out.println();
        sc.close();
    }
}    