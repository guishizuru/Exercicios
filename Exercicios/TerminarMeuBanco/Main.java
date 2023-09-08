package TerminarMeuBanco;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws InterruptedException {

        List<ContaBancaria> lista = new ArrayList<>();
        Correntista correntista1 = new Correntista("joao", "123", 19);
        Correntista correntista2 = new Correntista("jose", "123", 19);
        Correntista correntista3 = new Correntista("jonas", "123", 19);
        Correntista correntista4 = new Correntista("jack", "123", 19);

        ContaBancaria conta1 = new ContaBancaria(correntista1, 11);
        ContaBancaria conta2 = new ContaBancaria(correntista2, 10);
        ContaBancaria conta3 = new ContaBancaria(correntista3, 10);
        ContaBancaria conta4 = new ContaBancaria(correntista4, 10);

        lista.add(conta1);
        lista.add(conta2);
        lista.add(conta3);
        lista.add(conta4);

        ContaBancaria contaBancaria = new ContaBancaria();
      //  contaBancaria.depositar(lista);



    }
}
