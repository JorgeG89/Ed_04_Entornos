package ed.tarea04;

/**
 * @author Cristian Jorge García Marcos
 * @version 11.20
 */

public class ControladorCuentaBancaria {

    public static void main(String[] args) {

        // crea
        CuentaBancaria miCuenta = new CuentaBancaria("Jorge Izquierdo", "00491500051234567892");

        operacionesCuenta(miCuenta, "texto", 15);

        System.out.println(miCuenta.toString());
    }

    private static void operacionesCuenta(CuentaBancaria miCuenta, String operacion, float cantidad) {


        try {
            miCuenta.ingresar(10000);
        } catch (Exception e) {
            System.err.print(e.getMessage());
            System.out.println("Error en el método ingresar. ");
        }

        try {
            miCuenta.retirar(1500);
        } catch (Exception e) {
            System.err.print(e.getMessage());
            System.out.println("Error en el método retirar. ");
        }
    }

}
