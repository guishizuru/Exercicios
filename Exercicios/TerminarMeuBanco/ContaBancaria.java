package TerminarMeuBanco;

import java.util.List;
import java.util.Scanner;

public class ContaBancaria {
    private double saldo;
    private Correntista correntista;
    private double chequeEspecial;
    private double valorQueDesejaDepositar;
    private String nomeDoUsuario ;


    Scanner scanner = new Scanner(System.in);

    public ContaBancaria() {

    }

    public ContaBancaria(Correntista correntista, double saldo) {
        this.saldo = saldo;
        this.correntista = correntista;
        this.chequeEspecial = 0f;
    }

    public void adicionarUsuariosESaldos(List<ContaBancaria> contaBancarias, Correntista correntista, double saldo) {
        ContaBancaria contaBancaria = new ContaBancaria(correntista, saldo);
        contaBancarias.add(contaBancaria);
    }

    public void depositar(List<ContaBancaria> contaBancarias){
        inserirCorrentista();
        for (ContaBancaria conta : contaBancarias) {
            if(correntista.getNome().equals(correntista.getNome())){
            conta.saldo += valorQueDesejaDepositar;
            System.out.printf("Valor depositado" + valorQueDesejaDepositar + "\n");
            System.out.printf("saldo " + this.saldo);

            return;

        }
    }
        System.out.printf("TerminarMeuBanco.Correntista nao encontrado :");
}
    public void inserirCorrentista(){
        System.out.print("Digite o nome do Usuario para deposito :");
        String nomeDoUsuario = scanner.next();

        System.out.printf("Digite o valor de deposito :");
        double valorQueDesejaDepositar = scanner.nextDouble();
    }



//throws InterruptedException {
        //   int contador = 0;
        /*for (TerminarMeuBanco.ContaBancaria contaBancaria : contaBancarias) {
            contador++;
            Thread.sleep(1000);
            System.out.print("Digite o nome do Usuario para deposito :");
            String nomeDoUsuario = scanner.next();
            if (nomeDoUsuario.equals( contaBancaria.getCorrentista())){

            System.out.printf("Digite o valor de deposito :");
            double valorQueDesejaDepositar = scanner.nextDouble();

            double saldoAtual = contaBancaria.getSaldo();
            double somaDoDepositoMaisSaldoAtual = saldoAtual + valorQueDesejaDepositar;

            contaBancaria.setSaldo(somaDoDepositoMaisSaldoAtual);
            System.out.printf("Valor atualizado " + contaBancaria.getSaldo() + "R$");
            break;

            } else {
                Thread.sleep(1000);
                System.out.print("Usuario nao existe");
                Thread.sleep(1100);
                System.out.printf("\nTentativa de " + contador + "/3");
                System.out.printf("\n----------------------------------------\n");

                if(contador == 3){
                    Thread.sleep(1200);
                    System.out.printf("\nConta Bloqueada");
                    break;
                }

            }


        }*/


    }



