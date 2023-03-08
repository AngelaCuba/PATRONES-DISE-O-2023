package practicaSingleton2;

public class Banco {
    public void conversionesBol(double bol){
        System.out.println(bol+" BS----------------");
        System.out.println(EmpresaSingleton.getInstance().bolADolar(bol)+"$");
        System.out.println(EmpresaSingleton.getInstance().bolAEuro(bol)+"E");
        depositar(bol);
    }

    public void conversionesDol(double bol){
        System.out.println(bol+" $----------------");
        System.out.println(EmpresaSingleton.getInstance().dolarABol(bol)+"BS");
        System.out.println(EmpresaSingleton.getInstance().dolarAEuro(bol)+"E");
        depositar(EmpresaSingleton.getInstance().dolarABol(bol));
    }

    public void conversionesEu(double bol){
        System.out.println(bol+" E----------------");
        System.out.println(EmpresaSingleton.getInstance().euroABol(bol)+"BS");
        System.out.println(EmpresaSingleton.getInstance().euroADolar(bol)+"$");
        depositar(EmpresaSingleton.getInstance().euroABol(bol));
    }

    public void show(){
        System.out.println("BANCO*********************");
    }

    public void depositar(double bol){
        Cuenta.getInstance().depositar(bol);
    }

    
}
