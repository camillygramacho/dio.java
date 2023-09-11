package br.com.ucss;


    import java.util.Scanner;

    public class ContaTerminal {

        public static void main(String[] args) throws Exception {

            Scanner scanner = new Scanner(System.in);

            int conta;
            String agencia;
            String NomeCliente;
            double saldo;

            System.out.println("Digite o numéro da conta: ");
            conta = scanner.nextInt();

            System.out.println(" Digite o número da agência: ");
            agencia = scanner.next();

            System.out.println(" Digite o nome do cliente: ");
            NomeCliente = scanner.next();

            System.out.println(" Digite o valor do saldo: ");
            saldo = scanner.nextDouble();

            System.out.println(" Olá " + NomeCliente + " Obrigada por criar uma agência em nosso banco. Sua agência é" + agencia + " conta " + conta + " e seu saldo é: " + saldo + " disponível para saque ");




        }
    }

