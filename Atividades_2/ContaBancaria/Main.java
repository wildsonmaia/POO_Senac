package Atividades_2.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        ContaBancaria cBancaria = new ContaBancaria();
        float vSaldo, vDeposito, vSaque;
        int opcao;        

        System.out.println("Esolha uma opção: \n" + //
                         "      1 - Saldo; \n"  + //
                         "      2 - Depósito; \n" + //
                         "      3 - Saque.");

        opcao = teclado.nextInt();
        switch (opcao) {
            case 1:
                vSaldo = cBancaria.saldo;
                System.out.println("Seu saldo é: " + vSaldo);
                break;

            case 2:
                System.out.println("Que valor você gostaria de depositar?");
                vDeposito = teclado.nextFloat();
                cBancaria.depositar(vDeposito);
                break;

            case 3:
                System.out.println("Que valor você gostaria de sacar?");
                vSaque = teclado.nextFloat();
                cBancaria.sacar(vSaque);
                break;

            default:
                break;
        }
        teclado.close();
    }
}
