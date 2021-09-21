package ImersaoAula01.src.JavaOOPNext.Aula3.Ingresso;

public class IngressoVIP extends Ingresso {
    
    private Double valorAdicional;


    public IngressoVIP (Double valor, Double valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString(){
        return "Valor do ingresso: R$" + (super.getValor() + valorAdicional);
    }


    public Double getValorAdicional() {
        return this.valorAdicional;
    }


}
