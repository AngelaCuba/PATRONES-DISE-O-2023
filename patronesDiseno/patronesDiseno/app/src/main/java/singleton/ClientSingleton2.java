package singleton;

public class ClientSingleton2{

    public static void main(String[] args) {
        
        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();
        Singleton2 singleton3 = Singleton2.getInstance();

        System.out.println("singleton 1: "+singleton1+" HASH: "+singleton1.hashCode());
        System.out.println("singleton 2: "+singleton2+" HASH: "+singleton2.hashCode());
        System.out.println("singleton 3: "+singleton3+" HASH: "+singleton3.hashCode());
    }

}