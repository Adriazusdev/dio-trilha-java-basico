import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        
        //String nomeCliente = args [0];
        //String agencia = args [1];
        //int nrAgencia = Interger.valueOf(args[2]);
        //double saldo = Double.valueOf(args[3]);

        System.out.println("Digite Seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();
        
        System.out.println("Digite sua agencia");
        String agencia = scanner.next();

        System.out.println("Digite o numero da sua conta (use somente numeros)");
        int nrConta = scanner.nextInt();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos
        System.out.println("Seja bem vindo " + nome + " " + sobrenome);
        System.out.println("O numero da sua agencia é " + agencia);
        System.out.println("O numero da sua conta é " + nrConta);
        System.out.println("O seu saldo atual disponivel para saque é " + saldo);
    }
}
