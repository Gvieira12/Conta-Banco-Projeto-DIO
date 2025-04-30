import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome para iniciarmos a criação da conta:");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor digite o número da agência:");
        agencia = sc.next();
        System.out.println("Digite o número da conta:");
        numero = sc.nextInt();
        System.out.println("Qual valor deseja depositar de inicio?");
        saldo = sc.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
