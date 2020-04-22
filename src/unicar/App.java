package unicar;
import java.util.Scanner;

public class App extends Unicap{
    public static Scanner input= new Scanner(System.in);
    
    public void MenuPrincipal(){
        int opcao,matricula, aux;
        String nome,placa,cor,modelo;
        Funcionario f= new Funcionario();
        Unicap Unicap = new Unicap();
        f.inicializaVetor();
 
        do{
            System.out.println("**************************************************");
            System.out.println("Bem vindo ao Unicar, o estacionamento da Unicap!!");
            System.out.println("Escolha o que deseja fazer: ");
            System.out.println("1- Cadastrar na Unicar");
            System.out.println("2- CheckIn");
            System.out.println("3- CheckOut");
            System.out.println("4- Checar se há vaga livre");
            System.out.println("5- Checar se meu carro está cadastrado");
            System.out.println("6- Fechar Menu");
            opcao= input.nextInt();
            input.nextLine();
            switch(opcao){
                
                case 1: 
                    System.out.println("Informe seu nome: ");
                    nome= input.nextLine();
                    System.out.println("Informe sua matricula: ");
                    matricula= input.nextInt();
                    input.nextLine();
                    System.out.println("Informe o modelo do seu carro: ");
                    modelo= input.nextLine();
                    System.out.println("Informe a cor do seu carro: ");
                    cor= input.nextLine();
                    System.out.println("Informe a placa do seu carro: ");
                    placa= input.nextLine();
                    while(checaPlaca(placa) == true){
                        System.out.println("Placa já cadastrada, informe outra placa");
                        placa= input.nextLine();
                    }
                    try{
                    Aluno a= new Aluno(nome,matricula,cor,modelo,placa);
                    Unicap.adicionaAluno(a);                    
                    } catch (Exception exception){
                        System.out.println(exception.getMessage());                      
                    }                    
                    break;
                    
                case 2: 
                    System.out.println("Informe a placa do seu carro: ");
                    placa= input.nextLine();
                    f.checkIn(placa);
                    break;
                  
                    
                case 3:
                    System.out.println("Informe a placa do seu carro: ");
                    placa= input.nextLine();
                    f.checkOut(placa);
                    break;
                    
                    
                case 4:
                    System.out.println("Há disponível: "+f.vagasLivres()+" vagas!"); 
                    break;
                    
                    
                case 5:
                    System.out.println("Informe a placa do seu carro: ");
                    placa= input.nextLine();
                    if(Unicap.checaPlaca(placa)){
                        System.out.println("O carro de placa "+placa+" está cadastrado!");
                    }
                    else{
                        System.out.println("O carro de placa "+placa+" não está cadastrado!");
                    }
                    break;
                    
                    
                case 6: 
                    System.out.println("Obrigado por visitar a Unicar!!");
                    System.out.println("**************************************************");
                    return;
                    
                    
                default:
                    System.out.println("Opção inválida!");
            }
            
        }while(opcao != 0);
    }

 
}