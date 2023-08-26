import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();
        
        System.out.println("Por favor digite o número da conta: ");
        int numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor digite o saldo da conta: ");
        double saldoConta = Double.parseDouble(scanner.next());

        System.out.println("Olá, " + nomeCliente + 
        ", obrigado por abrir uma conta em nosso banco, sua agência é " + 
        numeroAgencia + " e sua conta é " + numeroConta + " e seu saldo de " + saldoConta + 
        " reais já está disponível para uso.");

        scanner.close();
    }
}
