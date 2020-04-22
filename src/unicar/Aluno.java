
package unicar;


public class Aluno {
    protected String nome;
    protected int matricula;
    protected Carro carro;

    public Aluno(String nome, int matricula, String cor, String modelo, String placa) {
        this.nome = nome;
        this.matricula = matricula;
        this.carro = new Carro(cor,modelo,placa);
    }
    
    public Carro getCarro(){
        return this.carro;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCarro(String cor, String modelo, String placa){
        this.carro.setCor(cor);
        this.carro.setModelo(modelo);       
        this.carro.setPlaca(placa);
    }
    
    @Override
    public String toString(){
        return "Nome: "+this.nome+"/ Matricula: "+this.matricula+"/ Placa do Carro: "+this.carro.getPlaca();
    }

}