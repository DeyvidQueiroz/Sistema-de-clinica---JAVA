import java.rmi.server.Operation;
import java.util.Scanner;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ClinicaSaude {

   public static void main(String[] args) {

    int op;

    do {
      op = Integer.parseInt( JOptionPane.showInputDialog(
        "Bem Vindo!\n" +
        " Clinica Saúde e Bem Estar\n"+
        "1-paciente\n" +
        "2-proficional\n"+
        "0-encerrar"


      ));

      if(op==0)
         break;
      else if(op==1)
         paciente();
      else if(op==2)
         proficional(); 
      else
      JOptionPane.showMessageDialog(null,"Opção invalida, tente novamente");
      
    } while (op!=0);
    
    

    
    
  }

  private static void proficional() {
    int op;
    do {
      op = Integer.parseInt(JOptionPane.showInputDialog(
      "Ola , você estar na area do PROFICIONAL\n" +
        "1-entrar\n" +
        "2-cadastrar\n" +
        "0-VOLTAR PARA O INICIO"
        
        
      ));

      if(op==0)
         break;
      else if(op==1)
       conta();
      else if(op==2)
        cadastro();
     else
      JOptionPane.showMessageDialog(null,"Opção invalida, tente novamente");  
    } while (op!=0);
  }

  private static void paciente() {
    int op;
    do {
      op = Integer.parseInt(JOptionPane.showInputDialog(
      "Ola , você estar na area do PACIENTE\n" +
        "1-entrar\n" +
        "2-cadastrar\n" +
        "0-VOLTAR PARA O INICIO"
        
        
      ));

      if(op==0)
         break;
      else if(op==1)
       conta();
      else if(op==2)
        cadastro();
     else
      JOptionPane.showMessageDialog(null,"Opção invalida, tente novamente");  
    } while (op!=0);

     }

  private static void conta() {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Username");
    String name = input.nextLine();
    System.out.println("Password");
    String pass = input.nextLine();
    System.out.println("Bem vindo Sr."+ name);

     }

  private static void cadastro() {

    Scanner input = new Scanner(System.in);
    
    System.out.println("Username");
    String name = input.nextLine();
    System.out.println("Email");
    String email = input.nextLine();
    System.out.println("CPF");
    double cpf = input.nextDouble();
    System.out.println("Password");
    String pass = input.nextLine();
    System.out.println("Bem vindo Sr."+ name+"\nSua conta foi criada com sucesso");
  }
}