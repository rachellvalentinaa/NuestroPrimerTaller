import java.util.Scanner;

public class EstadisticasGrupo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[10];
        System.out.println("Ingresa las notas de 10 alumnos (0,0 a 5,0): ");

        double suma = 0; 
        double masAlta = 0;
        double masBaja = 0;
        int posAlta = 0;
        int posBaja = 0;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
             notas[i] = sc.nextDouble();

             suma += notas[i];
            
            if (i == 0) {
                masAlta = notas[i];
                masBaja = notas[i];
            } 
            else {
                if (notas[i] > masAlta) {
                    masAlta = notas[i];
                    posAlta = i;
                }

                if (notas[i] < masBaja) {
                    masBaja = notas[i];
                    posBaja = i;
                }
            }

            if (notas[i] >= 3.0) {
                aprobados++;
            }

            else {
                reprobados++;
            }
        }
        System.out.println();

        double promedio = suma / 10;

        System.out.println("Promedio del grupo: " + promedio);
        System.out.println();
        System.out.println("Nota más alta: " + masAlta + " (Estudiante " + (posAlta + 1) + ")");
        System.out.println();
        System.out.println("Nota más baja: " + masBaja + " (Estudiante " + (posBaja + 1) + ")");
        System.out.println();
        System.out.println("Aprobados: " + aprobados);
        System.out.println();
        System.out.println("Reprobados: " + reprobados);
        System.out.println();

        sc.close();
    }
}
