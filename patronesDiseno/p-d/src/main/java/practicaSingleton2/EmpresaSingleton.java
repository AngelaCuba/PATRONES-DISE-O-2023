package practicaSingleton2;

public class EmpresaSingleton {

    private static EmpresaSingleton instance = null;
    private double bolDolar;
    private double bolEuro;



    public static void setInstance(EmpresaSingleton instance) {
        EmpresaSingleton.instance = instance;
    }

    public double getBolDolar() {
        return bolDolar;
    }

    public void setBolDolar(double bolDolar) {
        this.bolDolar = bolDolar;
    }

    public double getBolEuro() {
        return bolEuro;
    }

    public void setBolEuro(double bolEuro) {
        this.bolEuro = bolEuro;
    }

    private EmpresaSingleton(){
        bolDolar = 7;
        bolEuro = 9;
        System.out.println("NUEVA CAJA DE CAMBIOS");
    }

    public static EmpresaSingleton getInstance(){
        if(instance == null){
           multiThreadManage();
        }
        return instance;
    }

    private synchronized static void multiThreadManage(){
        if(instance == null){
            instance = new EmpresaSingleton();
        }
    }

    public double bolADolar(double bol){
        return bol / bolDolar;
    }

    public double dolarABol(double dol){
        return dol * bolDolar;
    }

    public double bolAEuro(double bol){
        return bol / bolEuro;
    }

    public double euroABol(double eu){
        return eu * bolEuro;
    }

    public double dolarAEuro(double dol){
        return bolAEuro(dolarABol(dol));
    }

    public double euroADolar(double eu){
        return bolADolar(euroABol(eu));
    }

    
}
