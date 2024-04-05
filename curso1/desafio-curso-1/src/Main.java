import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        makeLine();
        Scanner scan = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();
        System.out.println("Digite seu nome: ");
        conta.setNomeTitular(scan.nextLine());
        makeLine();
        System.out.println("Tipo conta 1 = Poupança, Tipo conta 2: Corrente");
        int tipoConta = (int) scan.nextInt();
        scan.nextLine();
        if (tipoConta != 1 && tipoConta != 2) {
            conta.setTipoConta(tipoConta);
            System.exit(1);
        }
        conta.setTipoConta(tipoConta);
        makeLine();
        System.out.println("Informe o número da conta bancária: ");
        String numeroConta = scan.nextLine();
        conta.setNumeroConta(numeroConta);

        int sair = 0;
        do {
            int opcao = showMenu(scan, conta);
            switch (opcao) {
                case 1:
                    makeLine();
                    System.out.println("Seu saldo é de: R$ " + conta.getSaldo());
                    break;
                case 2:
                    makeLine();
                    System.out.println("Quanto quer receber? ");
                    conta.recebeTransferencia(scan.nextDouble());
                    System.out.println("Valor recebido.");
                    break;
                case 3:
                    makeLine();
                    System.out.println("Quanto quer transferir? ");
                    conta.fazTransferencia(scan.nextDouble());
                    break;
                case 4:
                    makeLine();
                    System.out.println("Que bom ter você conosco.");
                    sair = 1;
                    System.exit(0);
                default:
                    System.out.println("Opção de menu inválida");
            }
        } while (sair==0);
    }

    private static void makeLine() {
        System.out.println("=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+=+");
    }

    private static int showMenu(Scanner scanner, ContaBancaria contaBancaria) {
        makeLine();
        System.out.println("Informações da conta bancária: ");
        System.out.println(contaBancaria.toString());

        makeLine();
        System.out.println("Menu: ");
        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Receber valor");
        System.out.println("3 - Transferir valor");
        System.out.println("4 - Sair.");

        return scanner.nextInt();
    }
}