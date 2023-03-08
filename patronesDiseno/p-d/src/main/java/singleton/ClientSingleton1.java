package singleton;

public class ClientSingleton1{

    public static void main(String[] args) {
        
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();

        System.out.println("singleton 1: "+singleton1+" HASH: "+singleton1.hashCode());
        System.out.println("singleton 2: "+singleton2+" HASH: "+singleton2.hashCode());
        System.out.println("singleton 3: "+singleton3+" HASH: "+singleton3.hashCode());
    }

}