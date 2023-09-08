package BancoAle;

public class ContaBancaria {


    private float       saldo ;
    private float       chequeEspecial ;
    private Correntista correntista ;


    public boolean correntistaIsAutenticado( String senha ) {

        return this.correntista.getSenha( ).equals( senha ) ;

    }


    public ContaBancaria( float saldo , Correntista correntista ) {

        super( ) ;
        this.saldo          = saldo ;
        this.correntista    = correntista ;
        this.chequeEspecial = 0f ;

    }


    public ContaBancaria( float saldo , Correntista correntista , float chequeEspecial ) {

        this.saldo          = saldo ;
        this.correntista    = correntista ;
        this.chequeEspecial = chequeEspecial ;

    }


    public void depositar( float valorADepositar ) {

        this.saldo += valorADepositar ;

    }


    public void sacar( float valorASacar ) {

        if ( chequeEspecial == 0 && this.saldo >= valorASacar ) {

            this.saldo -= valorASacar ;

        } else if ( ( chequeEspecial + this.saldo ) >= valorASacar ) {

            this.chequeEspecial += saldo - valorASacar ;
            this.saldo           = 0 ;

        } else {

            System.out.println( "Erro ao sascar, limite de saldo excedido!" ) ;

        }


    }


    public void imprimeSaldo() {

        System.out.println( "nome : " + this.correntista ) ;
        System.out.println( "saldo : " + this.saldo ) ;
        System.out.println( "chequeEspecial : " + this.chequeEspecial ) ;
        System.out.println( "-------------------------------------------------\n" ) ;


    }


    public Correntista getCorrentista() { return correntista ; }


    public void setCorrentista( Correntista correntista ) { this.correntista = correntista ; }

}

