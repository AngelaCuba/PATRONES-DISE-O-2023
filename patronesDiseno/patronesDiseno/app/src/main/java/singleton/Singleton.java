package singleton;

public class Singleton {
    
    //1) attribute same type
    private static Singleton instance = null;

    //2) constructor private
    private Singleton(){
        System.out.println("Creacion deberia mostrarse 1 sola vez");
    }
    // global access
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    
    public void getName(){
        System.out.println("singleton ..");
    }

}
