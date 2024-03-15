package Atividades_2.ContaBancaria;

public class ContaBancaria {
    float saldo = 2000, deposito = 0, saque = 0;

    public void consultarSaldo (float valorSaldo){

        this.saldo = valorSaldo;
    }

    public void depositar (float valorDepo){

        System.out.println("Você depositou um valor de: R$ " + valorDepo);
        saldo += valorDepo;
        System.out.println("Seu saldo é: R$ " + saldo);
    }

    public void sacar (float valorSaque){

        if (valorSaque < saldo) {
            System.out.println("Saque não realizado. \nSeu saldo é inferior ao saque solicitado.");
        }else{
            System.out.println("Você sacou um valor de: R$ " + valorSaque);
            saldo -= valorSaque;
            System.out.println("Seu saldo é: R$ " + saldo);
        }
        
    }
}
