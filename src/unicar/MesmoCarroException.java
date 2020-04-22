package unicar;

public class MesmoCarroException extends Exception {

    public MesmoCarroException(String message, Throwable cause) {
        super(message, cause);
    }

    MesmoCarroException(String este_aluno_já_está_cadastrado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
