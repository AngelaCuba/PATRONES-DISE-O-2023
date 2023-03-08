package ejemploSingleton;

public class Cuenta {
    
    //ATRIBUTO DEL MISMO TIPO
    private static Cuenta instance = null;
    private double saldo;

    //CONSTRUCTOR PRIVADO
    private Cuenta(){
        saldo = 1000;
        System.out.println("SALDO ORIGINAL: "+saldo);
    }

    //ACCESO GLOBAL
    public static Cuenta getInstance(){
        if(instance == null){
           multiThreadManage();
        }
        return instance;
    }

    //PARA EL PROBLEMA

    private synchronized static void multiThreadManage(){
        if(instance == null){
            instance = new Cuenta();
        }
    }

    public void retirarDinero(Double monto){
        if(monto <= saldo){
            saldo = saldo - monto;
            System.out.println("TRANSACCION EXITOSA. SU NUEVO SALDO ES: "+saldo);
        } else{
            System.out.println("NO PUEDE RETIRAR ESE MONTO :(");
        }
    }

    public void saldo(){
        System.out.println("SU SALDO ES: "+saldo);
    }
}
