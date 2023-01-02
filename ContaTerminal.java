import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        String nome, agencia;
        int numeroDaConta;
        double saldo;
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("---------- \n    BANK    \n----------");

        System.out.print("Digite o seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite a sua Agencia: ");
        agencia = scanner.nextLine();

        System.out.print("Digite o seu Numero da Conta:");
        numeroDaConta = scanner.nextInt();

        System.out.print("Digite o seu saldo:");
        saldo = scanner.nextDouble();
        
        System.out.println("--------------------");

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo de " + saldo + " já está disponível para saque.");
    }
}
