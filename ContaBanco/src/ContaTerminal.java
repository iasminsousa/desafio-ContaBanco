import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) throws Exception {
       Scanner scan= new Scanner(System.in);
       int numConta;
       String agencia;
       String nomeCliente;
       double saldoConta;
       System.out.println("Bem vindo ao Banco Finance!");
       System.out.print("Para começar, digite o seu nome: ");
       nomeCliente=scan.nextLine();
       System.out.print("Agora digite o número da sua conta: ");
       numConta= scan.nextInt();
       System.out.print("Digite a agência da sua conta: ");
       agencia= scan.next();
       System.out.print("Pronto, agora digite o seu saldo: ");
       saldoConta= scan.nextDouble();

       System.out.println("Olá " +nomeCliente+ ", obrigada por criar uma conta em nosso banco, sua agência é " +agencia+ " conta " +numConta+ " e seu saldo de " +saldoConta+ " já está disponível para saque");

       scan.close();
    }
}
