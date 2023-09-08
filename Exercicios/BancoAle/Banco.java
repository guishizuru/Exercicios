package BancoAle;

import java.util.ArrayList ;
import java.util.List ;


public class Banco {

    private String         nomeBanco ;
    List < ContaBancaria > contas = new ArrayList <>( ) ;


    public Banco( ) {


    }


    public Banco( String nomeBanco , List < ContaBancaria > contas ) {

        super( ) ;
        this.nomeBanco = nomeBanco ;
        this.contas    = contas ;

    }


    public String getNomeBanco() { return nomeBanco ; }


    public void setNomeBanco( String nomeBanco ) { this.nomeBanco = nomeBanco ; }


    public List < ContaBancaria > getContas() { return contas ; }


    public void setContas( List < ContaBancaria > contas ) { this.contas = contas ; }


}

