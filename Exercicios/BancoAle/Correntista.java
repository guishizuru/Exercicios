package BancoAle;



public class Correntista {

    private String nome ;
    private String senha ;
    private int    idade ;


    public Correntista( String nome , String senha , int idade ) {

        super( ) ;
        this.nome  = nome ;
        this.senha = senha ;
        this.idade = idade ;

    }


    public String getNome() { return nome ; }


    public void setNome( String nome ) { this.nome = nome ; }


    public String getSenha() { return senha ; }


    public void setSenha( String senha ) { this.senha = senha ; }


    public int getIdade() { return idade ; }


    public void setIdade( int idade ) { this.idade = idade ; }


}