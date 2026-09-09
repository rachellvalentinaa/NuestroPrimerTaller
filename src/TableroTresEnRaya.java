import java.util.Scanner;

public class TableroTresEnRaya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };

        int turno = 1;
        boolean ganador = false;
        boolean lleno = false;

        while (!ganador && !lleno) {

            mostrarTablero(tablero);

            char jugador;

            if (turno == 1) {
                jugador = 'X';
            } 
            
            else {
                jugador = 'O';
            }

            System.out.println("Turno del jugador " + jugador);

            int fila;
            int columna;

            do {
                System.out.print("Ingrese la fila (0-2): ");
                fila = sc.nextInt();

                System.out.print("Ingrese la columna (0-2): ");
                columna = sc.nextInt();

                if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                    System.out.println("La posición no es válida.");
                } else if (tablero[fila][columna] != ' ') {
                    System.out.println("Esa casilla ya está ocupada.");
                }

            } 
            
            while (fila < 0 || fila > 2 || columna < 0 || columna > 2
                    || tablero[fila][columna] != ' ');

            tablero[fila][columna] = jugador;

            ganador = verificarGanador(tablero, jugador);

                 ////AQUI SE REVISA SI TODAVIA QUEDAN ESPACIOS EN EL TABLERO
            lleno = true;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablero[i][j] == ' ') {
                        lleno = false;
                    }
                }
            }

            if (!ganador) {
                if (turno == 1) {
                    turno = 2;
                } else {
                    turno = 1;
                }
            }
        }

        mostrarTablero(tablero);

        if (ganador) {
            System.out.println("Ganó el jugador " + (turno == 1 ? 'X' : 'O'));
        } else {
            System.out.println("Empate");
        }

        sc.close();
    }

    public static void mostrarTablero(char[][] tablero) {

        System.out.println();
        System.out.println("  0   1   2");
        System.out.println("-------------");

        for (int i = 0; i < 3; i++) {
            System.out.println(i + " " + tablero[i][0] + " | "
                    + tablero[i][1] + " | " + tablero[i][2]);

            if (i < 2) {
                System.out.println("-------------");
            }
        }

        System.out.println();
    }

    public static boolean verificarGanador(char[][] tablero, char jugador) {

        ///pARA REVISAR LA FILAS
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == jugador
                    && tablero[i][1] == jugador
                    && tablero[i][2] == jugador) {
                return true;
            }
        }

        // PARA REVISAR LAS COLUMNAS
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i] == jugador
                    && tablero[1][i] == jugador
                    && tablero[2][i] == jugador) {
                return true;
            }
        }

        // SE REVISAN LAS DIAGOLAS 
        if (tablero[0][0] == jugador
                && tablero[1][1] == jugador
                && tablero[2][2] == jugador) {
            return true;
        }

        if (tablero[0][2] == jugador
                && tablero[1][1] == jugador
                && tablero[2][0] == jugador) {
            return true;
        }

        return false;
    }
}