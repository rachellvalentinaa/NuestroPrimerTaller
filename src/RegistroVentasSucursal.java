import java.util.Scanner;

public class RegistroVentasSucursal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double[][] ventas = new double[4][3];

        for (int sucursal = 0; sucursal < 4; sucursal++) {
            for (int producto = 0; producto < 3; producto++) {
                System.out.print("Ingrese las ventas de la sucursal " + (sucursal + 1)
                        + ", producto " + (producto + 1) + ": $ ");
                ventas[sucursal][producto] = sc.nextDouble();
            }
        }

        double ventaMasAlta = ventas[0][0];
        int sucursalVentaMasAlta = 0;
        int productoVentaMasAlta = 0;

        System.out.println();
        System.out.println("--- Ventas por sucursal ---");
        for (int sucursal = 0; sucursal < 4; sucursal++) {
            double totalSucursal = 0;

            for (int producto = 0; producto < 3; producto++) {
                totalSucursal += ventas[sucursal][producto];

                if (ventas[sucursal][producto] > ventaMasAlta) {
                    ventaMasAlta = ventas[sucursal][producto];
                    sucursalVentaMasAlta = sucursal;
                    productoVentaMasAlta = producto;
                }
            }

            System.out.println("Sucursal " + (sucursal + 1) + ": $ " + totalSucursal);
        }

        System.out.println();
        System.out.println("--- Ventas por producto ---");
        for (int producto = 0; producto < 3; producto++) {
            double totalProducto = 0;

            for (int sucursal = 0; sucursal < 4; sucursal++) {
                totalProducto += ventas[sucursal][producto];
            }

            System.out.println("Producto " + (producto + 1) + ": $ " + totalProducto);
        }

        System.out.println();
        System.out.println("Venta más alta: $ " + ventaMasAlta
                + " (Sucursal " + (sucursalVentaMasAlta + 1)
                + ", Producto " + (productoVentaMasAlta + 1) + ")");

        sc.close();
    }
}
