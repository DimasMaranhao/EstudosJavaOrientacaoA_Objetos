package ImersaoAula01.src.JavaOOPNext.Aula3.Ingresso;

import java.util.Objects;

public class Ingresso extends Object {  //NAO NECESSÁRIO, POIS É A CONTA MAIS SUPER DO JAVA
    private Double valor;

    public Ingresso(){

    }

    public Ingresso (Double valor){
        this.valor = valor;
    }

    @Override
    public String toString() {      //----------------------> CONVERTE O ENDERECO DE NOSSO OBJETO PARA UMA STRING
        return "Valor do ingresso: R$" + valor;        
    }


    /* @Override
    public boolean equals (Object o) {        
        Ingresso ingresso = (Ingresso) o;
        return Objects.equals(valor, ingresso.valor);
    } */


    public Double getValor() {
        return this.valor;
    }

    @Override
    public boolean equals (Object o) {    
        if (o == this)    {
            return true;        
        }
        if (!(o instanceof IngressoVIP)){
            return false;
        }
        Ingresso ingresso = (Ingresso) o;
        return Objects.equals(valor, ingresso.valor);
    }
}
