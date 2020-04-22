package unicar;

public class Funcionario extends Unicap {
    
    protected boolean[] estacionamento;
    protected int qtdVagas;
    
    public Funcionario(){
        this.estacionamento= new boolean[200];
        this.qtdVagas= 0;
    }
    
    public void inicializaVetor(){
        int i;
        
        for(i= 0; i < this.estacionamento.length; i++){
            this.estacionamento[i]= false;
        }
    }
    
    public int ChecaVagaLivre(){
        int i;
        
        for(i= 0; i <= this.qtdVagas; i++){
            if(this.estacionamento[i] == false){
                return i;
            }
        }
        return -1;
    }
    
    public void checkIn(String placa){
        int i;
        
        for(i= 0; i <= this.qtdAlunos; i++){
            if(!checaPlaca(placa) && this.qtdVagas <= 200){
                System.out.println("Entrada liberada!");
                this.estacionamento[this.qtdVagas] = true;
                this.qtdVagas++;
                break;
            }
        }
    }
    
    public void checkOut(String placa){
        int i;
        
        for(i= 0; i <= this.qtdAlunos; i++){
            if(!checaPlaca(placa)){
                System.out.println("Saída liberada!");
                this.estacionamento[this.qtdVagas] = false;
                this.qtdVagas--;
            }
        }
    }
    
    public int vagasLivres(){
        return 200 - this.qtdVagas;
    }
    
}