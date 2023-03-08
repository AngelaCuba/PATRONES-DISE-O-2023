package primerParcialFilaB.ejercicio1Singleton;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Estudiante a = new Estudiante("Juan", "123");
        Estudiante b = new Estudiante("Juan", "234");
        Estudiante c = new Estudiante("Juan", "345");
        Estudiante d = new Estudiante("Juan", "456");

        Registro a1 = new Registro(new Tesis("hola", "mundo", a ), "8:00");
        Registro b1 = new Registro(new Tesis("pepe", "grillo", b ), "8:00");
        Registro c1 = new Registro(new Tesis("hola", "torotoro", c ), "8:00");
        Registro d1 = new Registro(new Tesis("ghibli", "studio", d ), "8:00");

        Thread uno = new Thread(new Runnable() {
            @Override
            public void run() {
                Inscriptor.getInstance().inscribirTesis(a1);
            }
        });

        Thread dos = new Thread(new Runnable() {
            @Override
            public void run() {
                Inscriptor.getInstance().inscribirTesis(b1);
            }
        });

        Thread tres = new Thread(new Runnable() {
            @Override
            public void run() {
                Inscriptor.getInstance().inscribirTesis(c1);
            }
        });

        Thread cuatro = new Thread(new Runnable() {
            @Override
            public void run() {
                Inscriptor.getInstance().inscribirTesis(d1);
            }
        });

        Thread cinco = new Thread(new Runnable() {
            @Override
            public void run() {
                Inscriptor.getInstance().inscribirTesis(c1);
            }
        });

        uno.start();
        dos.start();
        tres.start();
        cuatro.start();
        cinco.start();

        Thread.sleep(500);
        
        Inscriptor.getInstance().verRegistro();
    }
}
