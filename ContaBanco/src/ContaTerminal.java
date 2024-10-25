import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao nosso banco!");
        System.out.println("Vamos criar sua conta.");

        // Solicitar dados ao usuário
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Por favor, digite o número da Agência (ex: 067-8): ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o seu Nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o Saldo inicial (ex: 237.48): ");
        double saldo = scanner.nextDouble();

        // Exibir a mensagem final
        System.out.println("\n------------------------------------------");
        System.out.println("Olá, " + nomeCliente + "!");
        System.out.println("Obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é: " + agencia);
        System.out.println("Número da sua conta: " + numero);
        System.out.println("Seu saldo de R$" + saldo + " já está disponível para saque.");
        System.out.println("------------------------------------------");

        scanner.close(); // Fechar o scanner
    }
}
