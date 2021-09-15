package JavaOOPNext;

//modificador de acesso - class - NomeDaClasse
public class Conta2 {

    //Atributos (características)
    //modificador de acesso - tipo do atributo - nomeDoPadrao
    public String numero;   //-------------------> protected só estaria disponível dentro do "pacote JavaOOPNext"
    public String agencia;  //-------------------> public para poder ser utilizado em outro lugar
    private Double saldo;   //-------------------> private só pode ser utilizado através de "get" e "set"
    

    
    //modificador de acesso - NomeDaClasse - parametros
    public Conta2 (String numero, String agencia, Double saldo){    // ---------------------> Construtor 1 
                                                                    //(os construtores serao diferentes quanto aos tipos utilizados)
                                                                    //(se utilizados construtores de tipos exatamente iguais, não funcionará)
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo; //---------------------> o this. é obrigatório, nesse caso, pois o parametro possui o mesmo nome.
                                                   //Se fossem nomes diferentes, não seria necessário utilizá-lo
    }

    //modificador de acesso - NomeDaClasse - parametros
    public Conta2 (String numero, String agencia){  // ---------------------> Construtor 2
                                                    //(os construtores serao diferentes quanto aos tipos utilizados)
                                                    //(se utilizados construtores de tipos exatamente iguais, não funcionará)
        this.numero = numero;
        this.agencia = agencia; 
        this.saldo = 0.0;       
    }
    
    //Metodos (Ações) 
    //modificador de acesso - tipo de retorno - NomeDaClasse - parametros
    public void debitarSaldo(Double saque){     //--------------------------> não retorna nenhum valor (boolean, Integer, Double etc)
        if (saldo != null && saldo > 0 && saldo >= saque){  
            saldo -= saque;
            System.out.println(saldo);
        } else{
            //return    ------------------------------> cancelaria a execução do restante do método
            System.out.println("Não há saldo suficiente!");
        }
    }

    public void creditarSaldo (Double valor){
        saldo += valor;
    }

    //public static final String NOME = "FulanoDeTal";    -------------------------> static final cria tipo uma CONSTANTE que não poderá mais ser alterada

    public Double getSaldo(){   //--------------------------------> ENCAPSULAMENTO: proteção da variável "saldo"
                                        //como o parâmetro "saldo" está determinado como "private", só conseguiremos consultá-lo através do getSaldo
        return saldo;        
    }

    /*public Double setSaldo (Double valor){     //--------------------------------> ENCAPSULAMENTO: proteção da variável "saldo"
                                        //como o parâmetro "saldo" está determinado como "private", só conseguiremos alterá-lo através do setSaldo
        this.saldo = saldo;
    }*/
    

}
