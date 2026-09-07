import java.util.Scanner;

public class TableroTresEnRaya {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        char[][] tablero = new char[3][3];
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                tablero[fila][columna] = ' ';
            }
        }

        int turno = 1;
        boolean hayGanador = false;
        boolean tableroLleno = false;
        char simbolo = 'X';

        while (!hayGanador && !tableroLleno) {
            mostrarTablero(tablero);
            simbolo = turno == 1 ? 'X' : 'O';
            System.out.println("Turno del jugador " + simbolo);

            int fila;
            int columna;
            boolean celdaValida;

            do {
                System.out.print("Ingrese la fila (0-2): ");
                fila = sc.nextInt();
                System.out.print("Ingrese la columna (0-2): ");
                columna = sc.nextInt();

                celdaValida = fila >= 0 && fila < 3
                        && columna >= 0 && columna < 3
                        && tablero[fila][columna] == ' ';

                if (!celdaValida) {
                    System.out.println("Celda inválida, intenta de nuevo.");
                }
            } while (!celdaValida);

            tablero[fila][columna] = simbolo;
            mostrarTablero(tablero);

            hayGanador = verificarGanador(tablero, simbolo);

            tableroLleno = true;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tablero[i][j] == ' ') {
                        tableroLleno = false;
                    }
                }
            }

            if (!hayGanador) {
                turno = turno == 1 ? 2 : 1;
            }
        }

        if (hayGanador) {
            System.out.println("Ganó el jugador " + simbolo);
        } else {
            System.out.println("Empate");
        }
        System.out.println();
        sc.close();
    }

    public static void mostrarTablero(char[][] tablero) {
        System.out.println();
        System.out.println("  0   1   2");
        System.out.println("-------------");
        for (int fila = 0; fila < 3; fila++) {
            System.out.println(fila + " " + tablero[fila][0] + " | " + tablero[fila][1]
                    + " | " + tablero[fila][2]);
            if (fila < 2) {
                System.out.println("-------------");
            }
        }
        System.out.println();
    }

    public static boolean verificarGanador(char[][] tablero, char simbolo) {
        for (int fila = 0; fila < 3; fila++) {
            if (tablero[fila][0] == simbolo
                    && tablero[fila][1] == simbolo
                    && tablero[fila][2] == simbolo) {
                return true;
            }
        }

        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] == simbolo
                    && tablero[1][columna] == simbolo
                    && tablero[2][columna] == simbolo) {
                return true;
            }
        }

        return (tablero[0][0] == simbolo
                && tablero[1][1] == simbolo
                && tablero[2][2] == simbolo)
                || (tablero[0][2] == simbolo
                && tablero[1][1] == simbolo
                && tablero[2][0] == simbolo);
    }    
}
