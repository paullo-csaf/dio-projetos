import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua agência!");
            String agencia = leia.next();

        System.out.println("Por favor, digite o número da sua conta!");
            int conta = leia.nextInt();

        System.out.println("Por favor, digite seu nome!");
            String nome = leia.next();

        System.out.println("Por favor, digite o Saldo:");
            double saldo = leia.nextDouble();
    
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");  
            leia.close();
    
    }
}
