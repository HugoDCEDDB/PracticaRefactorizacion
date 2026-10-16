public class Main {
    public static void main(String[] args) {
        ProcesarFactura("Nuria","Teclado",25.0,2,10.0,21.0);
        ProcesarFactura("Carlos","Ratón",40.0,1,5.0,21.0);
        ProcesarFactura("Marta","Libreta",15.0,3,0.0,10.0);
        ProcesarFactura("Diego","Auriculares",32.5,2,15.0,21.0);
    }

    private static void ProcesarFactura(String nombreCliente, String producto, double precioProducto, int cantidadProducto, double descuento, double IVA) {
        double subtotal = getSubtotal(precioProducto, cantidadProducto);
        double importeDescuento = getImportePorcentaje(subtotal, descuento);
        double precioConDescuento = getPrecioConDescuento(subtotal, importeDescuento);
        double importeIva = getImportePorcentaje(precioConDescuento, IVA);
        double total = getTotal(precioConDescuento, importeIva);



        ImprimirFactura(nombreCliente, producto, precioProducto, cantidadProducto, subtotal, importeDescuento, importeIva, total);
    }

    //prueba3


    private static void ImprimirFactura(String nombreCliente, String producto, double precioProducto, int cantidadProducto, double subtotal, double importeDescuento, double importeIva, double total) {
        System.out.println("========== FACTURA ==========");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Producto: " + producto);
        System.out.println("Precio unitario: " + precioProducto + " euros");
        System.out.println("Cantidad: " + cantidadProducto);
        System.out.println("Subtotal: " + subtotal + " euros");
        System.out.println("Descuento: " + importeDescuento + " euros");
        System.out.println("IVA: " + importeIva + " euros");
        System.out.println("TOTAL: " + total + " euros");
        System.out.println("=============================");
    }

    private static double getTotal(double precioConDescuento, double importeIva) {
        return precioConDescuento + importeIva;
    }

    private static double getPrecioConDescuento(double subtotal, double importeDescuento) {
        return subtotal - importeDescuento;
    }

    private static double getImportePorcentaje(double subtotal, double descuento) {
        return subtotal * descuento / 100;
    }

    private static double getSubtotal(double precioProducto, int cantidadProducto) {
        return precioProducto * cantidadProducto;
    }
}