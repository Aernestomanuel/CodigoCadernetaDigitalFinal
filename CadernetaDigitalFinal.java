package ali.ernesto.manuel;

import java.util.ArrayList;
import java.util.Scanner;


public class CadernetaDigitalFinal {
	  static float media;
	  static String Resultado;
	  
	public static void main(String[] args) {
		
	
	
	Scanner scanner = new Scanner (System.in); //instanciação da classe Scanner para inserrção de dados via teclado
	
	ArrayList <Aluno> alunos = new ArrayList();//Instanciação da lista de alunos
			   
    System.out.println("Nome do Proessor: "); //Informações básicas do professor
    String nomeProf = scanner.nextLine();
     
                 
    System.out.println("Disciplina: ");
    String disciplina = scanner.nextLine();
     
  
     
    Professor p = new Professor();
    p.setNomeProf(nomeProf);
    p.setDisciplina(disciplina);
   
    
    System.out.println("Professor: " +nomeProf+"            Disciplina: "+disciplina);
    System.out.println("-----------------------------------------------------------------------");
 
     

	boolean f = true; //Delimitação do Menu de opções, para casos de inserção de alternativa inválida
	
	while (f) {
		//MENU DE OPÇÕES
		 	System.out.println("1 - Registar aluno");
	        System.out.println("2 - Exibir lista de alunos");
	        System.out.println("3 - Procurar aluno");
	        System.out.println("4 - Actualizar dados do aluno");
	        System.out.println("5 - Inserir nota do aluno");
	        System.out.println("6 - Extrair Resultados");
	        System.out.println("7 - Remover alunoo");
	        System.out.println("0 - Sair");
	        System.out.println("Digite a opção: ");
	        String opcao = scanner.nextLine();
	        
	        switch (opcao)
	        {
	        case "1":
	        	
	        {
                System.out.println("=== REGISTO DE ALUNOS ==="); //Inserção de nomes dos alunos
                System.out.println("");
                
                System.out.println("Digite o nome: ");
                String nome = scanner.nextLine();
                
                            
                System.out.println("Digite a idade: ");
                int idade = scanner.nextInt();
                                               
                
                Aluno a = new Aluno(); //Instanciaão do novo objecto a partir da classe Aluno
                a.setNome(nome); //invocação do método que permite inserir nome
                a.setIdade(idade);
               
                alunos.add(a);
                
                System.out.println ("Aluno registado com sucesso");
                
                
              break;
          }
	        
	        case "2":
	        {
                System.out.println(" === ALUNOS REGISTADOS ==="); //Exibição da lista dos alunos inseridos
                for (int i=0; i<alunos.size(); i++){
                    
                    Aluno v = alunos.get(i);
                    System.out.println("Aluno "+i);
                    System.out.println("\tNome: " +alunos.get(i).getNome());
                    System.out.println("\tIdade: " +alunos.get(i).getIdade());
                    System.out.println("----------fim da lista ----------");
                   
              
                    }  
                break;
            }
	        	
	        case "3":
	        	
	        {
                System.out.println("=== PROCURAR ALUNO ==="); //Procurar aluno mediante o nome digitado correctamente respeitando letras Maiúsculas ou minúsculas
                System.out.println("Digite o nome completo do aluno a procurar: ");
                String nome = scanner.nextLine();
                
                boolean encontrado = false;
                
                for (int i=0; i < alunos.size(); i++) {
                	
                   Aluno v = alunos.get(i);
                if (nome.equals(v.getNome())){
                    System.out.println("Aluno encontrado");
                    System.out.println("\tNome: " +alunos.get(i).getNome()); 
                    System.out.println("\tIdade: " +alunos.get(i).getIdade());
                    System.out.println("---fim da procura---");
                    
                    break;                    
                }   
                }
                if (encontrado == false) {
                    System.out.println("Aluno com este nome não foi encontrado"); //Caso seja digitado um nome de forma errada ou que não existe, será apresentado este erro
                }
                  
                               
                break;
            }
	        case "4":
	        	
	        	
	        {
                System.out.println("=== ACTUALIZAÇÃO DOS DADOS DO ALUNO ===");
                for (int i = 0; i < alunos.size(); i++) {
                    Aluno v = alunos.get(i);
                    System.out.println("("+i+")"+v.getNome()); //Existindo alunos, primeiro devem ser apresentados
                    
                }
                System.out.println("Digite o número de referencia: "); //A alteração é com base no número referente ao aluno em causa
                int referencia = scanner.nextInt();
                scanner.nextLine();
                                
                System.out.println("Digite o novo nome: ");
                String novoNome = scanner.nextLine();
                
                System.out.println("Digite a idade: ");
                int novaIdade = scanner.nextInt();
                       
                System.out.println ("Dados do aluno foram actualiados com sucesso");
                
                Aluno a = alunos.get(referencia);
                a.setNome(novoNome);
                a.setIdade(novaIdade);
                                          
                              
                break;
            }
	        case "5":
	        	
	        {
	        	System.out.println("=== NOTAS DO ALUNO ==="); //Serão inseridas notas de cada aluno sempre que for invocado o número referente ao aluno na lista
                for (int i = 0; i < alunos.size(); i++) {
                    Aluno v = alunos.get(i);
                    System.out.println("("+i+")"+v.getNome());
                }
              
                System.out.println("Digite o número de referencia: ");
                int referencia = scanner.nextInt();
                scanner.nextLine();
                                
                System.out.println("Digite a nota1: ");
                float nota1 = scanner.nextFloat();
                
                System.out.println("Digite a nota2: ");
                float nota2 = scanner.nextFloat();
              
                media = (nota1+nota2)/2;
               
                Aluno a = alunos.get(referencia);
                a.setNota1(nota1);
                a.setNota2(nota2);
                a.setMedia(media);
                            //Previsualização das notas e sua respectiva média do aluno em causa
                System.out.println("\tNome:  " +alunos.get(referencia).getNome());
                System.out.println("\tNota1: " +alunos.get(referencia).getNota1());
                System.out.println("\tNota2: " +alunos.get(referencia).getNota2());
                System.out.println("\tMédia: " +alunos.get(referencia).getMedia());
              
                                             
                
				break;
			}
	        
	        case "6":
	        	
	        	System.out.println("PROFESSOR: " +nomeProf+"            DISCIPLINA: "+disciplina);
	        	System.out.println("-----------------------------------------------------------------------");
	        	 
	        {
	        	System.out.println("=== RESULTADOS FINAIS ===");
	        	
                for (int referencia = 0; referencia < alunos.size(); referencia++) {
                    Aluno v = alunos.get(referencia);
                    
                if (media >=10) {
                	Resultado = "Aprovado";                	
                }else {
                	Resultado = "Reprovado";
                }
                            
                          
               Aluno a = alunos.get(referencia);
                     a.setResultado(Resultado);
                                          
                              //É apresentada toda a lista com todos alunos, suas médias e respectivo resultado final na disciplina
                System.out.println("\tNome: " +alunos.get(referencia).getNome());
                System.out.println("\tMedia: " +alunos.get(referencia).getMedia());
                System.out.println("\tResultado: " +alunos.get(referencia).getResultado());
                System.out.println("------");
                
                            
                
                } 
                
				break;
			}
	        case "7":
	        	
	        {
                System.out.println(" === REMOVER ALUNO ===");
                for (int i = 0; i < alunos.size(); i++) {
                    Aluno v = alunos.get(i);
                    System.out.println("("+i+")"+v.getNome());
                }
                System.out.println("Digite o número da referecia: ");
                int referencia = scanner.nextInt();
                scanner.nextLine();
                alunos.remove(referencia); //Permite remover um aluno por cada vez com base na lista previamente apresentada
                System.out.println("Aluno removido com sucesso");          
                
                break;
            }
	        
	        case "0":
	        {
               if (f = false) {
                System.out.println("Você saiu do Programa"); //Saindo do progrma, caso não se deseja mais operação
                break;
                }
             }
	        default:
	        {
	        	System.out.println("Opção inválida"); //Mensagem apresentada ao digitar uma opção que não consta no Menu
	        	break;
	        }
	        	
	      }
	      	
	
	    }
	}
}

	
	

