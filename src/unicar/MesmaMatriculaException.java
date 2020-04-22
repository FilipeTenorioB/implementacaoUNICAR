package unicar;

public class MesmaMatriculaException extends Exception {

    public MesmaMatriculaException(String message, Throwable cause) {
        super(message, cause);
    }

    MesmaMatriculaException(String este_aluno_já_está_cadastrado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
