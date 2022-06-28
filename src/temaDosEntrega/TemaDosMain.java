package temaDosEntrega;

public class TemaDosMain {
    public static void main(String[] args) {
        double precio = 49.95;
        double iva = 25d;
        double resultado = calculoPrecioConIva(precio, iva);
        System.out.println("El precio con el IVA es: " + resultado);
    }

    public static double calculoPrecioConIva(double precio, double iva){
        return precio * (iva/100 + 1);
    }
}
