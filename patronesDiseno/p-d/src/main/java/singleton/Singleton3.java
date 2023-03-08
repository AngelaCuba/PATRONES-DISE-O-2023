package singleton;

public class Singleton3 {
    
    private static Singleton3 instance = null;

    private Singleton3(){
        System.out.println("CREACION DEBERIA MOSTRARSE UNA SOLA VEZ");
    }

    //AÑADIMOS SYNC CUANDO MANEJAMOS VARIOS HILOS

    private synchronized static void multiThreadManage(){
        if(instance == null){
            instance = new Singleton3();
        }
    }

    public static Singleton3 getInstance(){
        if(instance == null){
            multiThreadManage();
        }
        return instance;
    }
}
