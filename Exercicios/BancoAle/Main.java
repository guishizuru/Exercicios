package BancoAle;

// com métodos para depositar, sacar e verificar o saldo.
import javax.swing.JOptionPane ;


public class Main {

    // Classe TerminarMeuBanco.Banco e Conta Bancária: Crie uma classe TerminarMeuBanco.Banco que contenha várias contas bancárias.
    // Cada conta bancária deve ser uma instância de uma classe TerminarMeuBanco.ContaBancaria
    // com métodos para depositar, sacar e verificar o saldo.
    public static void main( String [ ] args ) {


        Banco       itau                     = new Banco( ) ;
        float       saldo                    = 0f ;
        Correntista correntista              = new Correntista( "Jão" , "123" , 16 ) ;
        boolean     correntistaIsAutenticado = false ;


        ContaBancaria contaItauJoao = new ContaBancaria( saldo , correntista , 50f ) ;

        while ( !correntistaIsAutenticado ) {


            final String nome = contaItauJoao.getCorrentista( ).getNome( ) ;
            String       vlr  = JOptionPane.showInputDialog( nome + " digite sua senha" , null ) ;

            correntistaIsAutenticado = contaItauJoao.correntistaIsAutenticado( vlr ) ;

            if ( correntistaIsAutenticado ) {

                JOptionPane.showMessageDialog( null , "OK, usuario " + nome + " autenticado!!!" ) ;

            } else {

                JOptionPane.showMessageDialog( null , "Erro na senha " + nome + ", tente novamente!!!" ) ;

            }

        }


        itau.getContas( ).add( contaItauJoao ) ;


        contaItauJoao.depositar( 100f ) ;


        contaItauJoao.imprimeSaldo( ) ;

        contaItauJoao.sacar( 101f ) ;

        contaItauJoao.imprimeSaldo( ) ;


    }

}
