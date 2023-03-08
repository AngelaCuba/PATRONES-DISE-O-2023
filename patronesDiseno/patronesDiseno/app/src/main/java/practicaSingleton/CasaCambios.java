package practicaSingleton;

public class CasaCambios {
    public void conversionesBol(double bol){
        System.out.println(bol+" BS----------------");
        System.out.println(EmpresaSingleton.getInstance().bolADolar(bol)+"$");
        System.out.println(EmpresaSingleton.getInstance().bolAEuro(bol)+"E");
    }

    public void conversionesDol(double bol){
        System.out.println(bol+" $----------------");
        System.out.println(EmpresaSingleton.getInstance().dolarABol(bol)+"BS");
        System.out.println(EmpresaSingleton.getInstance().dolarAEuro(bol)+"E");
    }

    public void conversionesEu(double bol){
        System.out.println(bol+" E----------------");
        System.out.println(EmpresaSingleton.getInstance().euroABol(bol)+"BS");
        System.out.println(EmpresaSingleton.getInstance().euroADolar(bol)+"$");
    }

    public void show(){
        System.out.println("CASA DE CAMBIOS*********************");
    }
}
