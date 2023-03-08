package ejemploSingleton;

public class main {
    public static void main(String[] args) throws InterruptedException {

        Thread sucursal1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Sucursal sucursalA = new Sucursal(new Cliente("Jose"));
                sucursalA.retirarDinero(100);
            }
        });

        Thread cajero1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Cajero cajeroA = new Cajero(new Cliente("Jose"));
                cajeroA.retirarDinero(200);
            }
        });

        Thread web1 = new Thread(new Runnable() {
            @Override
            public void run() {
                WedApp webA = new WedApp(new Cliente("Jose"));
        webA.retirarDinero(300);
            }
        });


        sucursal1.start();
        cajero1.start();
        web1.start();
        Thread.sleep(200,0);
       Cuenta.getInstance().saldo();

        
    }
}
