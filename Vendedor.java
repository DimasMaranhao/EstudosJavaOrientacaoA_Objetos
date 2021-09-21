package ImersaoAula01.src.JavaOOPNext.Aula3.CadastroEmpregados;

public class Vendedor extends Empregado {

    protected Double comissao;

    public Vendedor (String nome, Double salario, Double comissao){
        super (nome, salario);
        this.comissao = comissao;         
    }
    protected double salarioComissionado;
    //this.salarioComissionado = salarioComissionado;

    public Double getComissao() {
        return this.comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }

    
    public double getSalarioComissionado() {
        return this.salarioComissionado;
    }

    public void setSalarioComissionado(double salarioComissionado) {
        this.salarioComissionado = salarioComissionado;
    }


    public double calcularSalario (double comissao){
        double salario = super.getSalario();        
        return salario += salario*comissao;
    }

    
    @Override
    public String toString() {
        return "Nome: " + super.getNome() + "\nSalario Bruto: R$" + super.getSalario() + "\nSalário Comissionado: R$" + calcularSalario(comissao) + "\nValor da Comissao: " + getComissao()*100 + "%" ;
    }
}



    

