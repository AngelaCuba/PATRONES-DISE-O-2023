package ejemploPrototype;

public class Client {
    public static void main(String[] args) {
        Entrada prototypeA = new Entrada(new Stadium("A", 200), new Equipo("Las Calacas"), new Equipo("No Las Calacas"));
        prototypeA.setFecha("12/12/12");
        prototypeA.setNumeroAsiento(12);
        prototypeA.setPersona(new Persona("Boris", "1234"));
        prototypeA.setPrecio("500 US");
        prototypeA.setLugar("Guadalajara");

        Entrada prototypeA1 = (Entrada) prototypeA.clone();
        Entrada prototypeA2 = (Entrada) prototypeA.clone();
        Entrada prototypeA3 = (Entrada) prototypeA.clone();
        Entrada prototypeA4 = (Entrada) prototypeA.clone();
        Entrada prototypeA5 = (Entrada) prototypeA.clone();

        prototypeA1.setPersona(new Persona("Juan", "4321"));
        prototypeA2.setFecha("10/10/10");
        prototypeA3.setLugar("Santa Cruz");
        prototypeA4.setPrecio("300 euros");
        prototypeA5.setNumeroAsiento(16);

        prototypeA.show();
        prototypeA1.show();
        prototypeA2.show();
        prototypeA3.show();
        prototypeA4.show();
        prototypeA5.show();
    }
}
