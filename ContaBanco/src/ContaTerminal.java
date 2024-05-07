import java.util.Scanner;

public class ContaTerminal {
  
    int numero         =  1021; 
    String Agencia     = "067-8";
    String NomeClient  = "MARIO ANDRADE";
    Double Saldo       =  237.48;

    public void main(String [] args){

        Scanner Read = new Scanner(System.in);

        int numero         =  1021; 
        String Agencia     = "067-8";
        String NomeClient  = "MARIO ANDRADE";
        Double Saldo       =  237.48;


         System.out.print("Por favor, digite o número da conta! ");
           numero = Read.nextInt(); 
    
         System.out.print("Por favor, digite o número da Agencia! ");
           Agencia = Read.next();

         System.out.print("Por favor, digite o seu Nome! ");
           NomeClient  = Read.next(); 

         System.out.print("qual e o valor que deseja deporitar! ");
           Saldo  = Read.nextDouble(); 
         
             String FinalMessage = "Olá " + NomeClient + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + numero + ", e seu saldo " + Saldo + " já eatá disponível para saque.";

                System.out.print(FinalMessage);    
   } 
}