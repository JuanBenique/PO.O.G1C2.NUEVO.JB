package pe.edu.upeu.pe.edu.upeu.sysventas.exception;

public class ModelNotFoundExcepcion extends RuntimeException {
    private final int errorCode;
    public ModelNotFoundExcepcion(String message) {
        super(message);
    }

}
