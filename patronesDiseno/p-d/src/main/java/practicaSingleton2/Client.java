package practicaSingleton2;

public class Client {
    public static void main(String[] args) throws InterruptedException{
        
        
        

        Thread banco1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco banco = new Banco();
                banco.show();
                banco.conversionesBol(70);
                banco.conversionesDol(10);
                banco.conversionesEu(9);
            }
        });

        Thread casaCambios1 = new Thread(new Runnable() {
            @Override
            public void run() {
                CasaCambios casaCambios = new CasaCambios();
                casaCambios.show();
                casaCambios.conversionesBol(70);
                casaCambios.conversionesDol(10);
                casaCambios.conversionesEu(9);
            }
        });
        
        Thread libre1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LibreCambista libre = new LibreCambista();
                libre.show();
                libre.conversionesBol(70);
                libre.conversionesDol(10);
                libre.conversionesEu(9);
            }
        });
        
        banco1.run();
        casaCambios1.run();
        libre1.run();
        
        Thread.sleep(200,0);
        System.out.println("SALDO:----------------------");
        Cuenta.getInstance().saldo();;
    }
}
