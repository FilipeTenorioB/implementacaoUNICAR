package unicar;


public class Unicap {

    protected Aluno[] alunos;
    protected int qtdAlunos;

    public Unicap() {
        this.alunos = new Aluno[1000];
        this.qtdAlunos = 0;
    }

    public void adicionaAluno(Aluno a) throws MesmaMatriculaException, MesmoCarroException {
        int i;

        for (i = 0; i <= this.qtdAlunos; i++) {
            if (this.alunos[i] != null && this.alunos[i].getMatricula() == a.getMatricula()) {
                throw new MesmaMatriculaException("Este aluno já está cadastrado.");
            }
            if (this.alunos[i] != null && this.alunos[i].getCarro().getPlaca().equals(a.getCarro().getPlaca())) {
                throw new MesmoCarroException("Esta placa já está cadastrada.");
            }
            if (this.alunos[i] == null) {
                this.alunos[this.qtdAlunos] = a;
                this.qtdAlunos++;
                System.out.println("Permitida a entrega do adesivo!!");
                break;
            }
        }
    }

    public boolean checaPlaca(String placa) {
        int i;

        for (i = 0; i < this.qtdAlunos; i++) {
            if (this.alunos[i].getCarro().getPlaca().equals(placa)) {
                return true;
            }
        }
        return false;
    }
}




