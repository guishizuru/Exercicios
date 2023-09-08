package TerminarMeuBanco;

import javax.net.ssl.SSLContext;
import java.util.ArrayList;
import java.util.List;

public class Banco {
   private String nomeDoBanco;
   List<ContaBancaria>  contas = new ArrayList<>();

   public Banco(){

   }
   public Banco(String nomeDoBanco,List<ContaBancaria> contas) {
       this.nomeDoBanco = nomeDoBanco;
       this.contas = contas;
   }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    public List<ContaBancaria> getContas() {
        return contas;
    }

    public void setContas(List<ContaBancaria> contas) {
        this.contas = contas;
    }
}
