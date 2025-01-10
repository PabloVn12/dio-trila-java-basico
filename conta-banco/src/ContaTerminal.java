import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) throws Exception {
    
        Scanner sc = new Scanner(System.in);
       

        System.out.print("Digite o número da sua conta: ");
        int agencia = sc.nextInt();
        sc.nextLine();  

        System.out.print("Digite o número da sua agencia: ");
        String numero = sc.nextLine();

        System.out.print("Digite o valor do seu saldo: ");
        double saldo = sc.nextDouble();
        sc.nextLine();

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Olá " +nome+ ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia+ " ,conta " +numero+ " e seu saldo " +saldo+ " já está disponível para saque");
        


        
    



    }
}
