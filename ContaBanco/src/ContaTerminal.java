import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia, nomeCli;
        double saldo;

        System.out.println("Digite seu nome");
        nomeCli = sc.nextLine();

        System.out.println("Digite sua agencia.");
        agencia = sc.nextLine();

        System.out.println("Digite seu numero.");
        numero = sc.nextInt();

        System.out.println("Digite seu Saldo.");
        saldo = sc.nextDouble();


        System.out.println("Olá " + nomeCli + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia +
         ", conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque");
    }
}
