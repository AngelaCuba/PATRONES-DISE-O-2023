package chainOfResponsability.ejercicio;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void reportarProblema(Falla falla);
}
