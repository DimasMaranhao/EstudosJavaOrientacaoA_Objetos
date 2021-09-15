package JavaOOPNext;

//modificador de acesso  - class - NomeDaClasse
public class Conta {

    //Atributos (características)
    //modificador de acesso - tipo do atributo - nomeDoPadrao
    public String numero;
    public String agencia;
    private Double saldo;
    
    public void debitarSaldo(Double saque){
        if (saldo != null && saldo > 0 && saldo >= saque){  
            saldo -= saque;
        } else{
            System.out.println("Não há saldo suficiente!");
        }
    }

    public void creditarSaldo (Double valor){
        saldo += valor;
    }

}
