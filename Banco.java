
/**
 *
 * @author Fernando
 */
import java.util.Scanner;

class Cliente {

    private String nome;
    private String sobrenome;
    private String cpf;
    private double saldo;

    public Cliente(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.saldo = 0;
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é de R$" + saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Você fez um depósito de R$" + valor);
        } else {
            System.out.println("Não foi possível realizar o depósito neste valor, tente novamente.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque no valor de R$" + valor + "Realizado com sucesso.");
        }
        else {System.out.println("Saldo insuficiente.");}
    }
}

public class Banco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome, por favor:");
        String nome = scanner.nextLine();
        System.out.println("Informe seu sobrenome, por favor:");
        String sobrenome = scanner.nextLine();
        System.out.println("Informe seu CPF, por favor:");
        String cpf = scanner.nextLine();
        Cliente cliente = new Cliente(nome, sobrenome, cpf);

        boolean menu = true;
        while (menu) {
            System.out.println("Escolha uma opção ao digitar o número:");
            System.out.println("(1) - Consultar Saldo");
            System.out.println("(2) - Fazer Saque");
            System.out.println("(3) - Fazer Depósito");
            System.out.println("(4) - Encerrar Operação");

            int opção = scanner.nextInt();
            switch (opção) {
                case 1:
                    cliente.consultarSaldo();
                    break;
                case 2:
                    System.out.println("Valor a ser Sacado");
                    double valorSaque = scanner.nextDouble();
                    cliente.sacar(valorSaque);
                    break;
                case 3:
                    System.out.println("Valor a ser depositado");
                    double valorDeposito = scanner.nextDouble();
                    cliente.depositar(valorDeposito);
                    break;
                case 4:
                    menu = false;
                    System.out.println("Encerrando Operação, até logo.");
                    break;
                default:
                    System.out.println("Opção não encontrada, tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}