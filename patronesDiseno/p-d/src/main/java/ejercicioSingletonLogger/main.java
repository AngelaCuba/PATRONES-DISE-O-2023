package ejercicioSingletonLogger;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Thread cliente1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cliente cliente = new Cliente("Jose", "1234");
                cliente.registrar();
                cliente.usarCupon(150);
            }
        });


        Thread factura1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Factura factura = new Factura("1234", 100.00);
                factura.escribir();
                factura.anular();
            }
        });

        Thread producto1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Producto producto = new Producto("Café", "Nestle");
                producto.registrar();
                producto.eliminar();
            }
        });

        Thread promocion1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Promociones promocion = new Promociones(new Producto("Ceibolitos", "El Ceibo"), 10);
                promocion.anadir();
                promocion.quitar();
            }
        });

        cliente1.start();
        factura1.start();
        producto1.start();
        promocion1.start();
    }
}
