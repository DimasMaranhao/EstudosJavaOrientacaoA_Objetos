package ImersaoAula01.src.JavaOOPNext.Aula3.CadastroEmpregados;

public class Empregado {
    public String nome;
    protected Double salario;

    public Empregado(){        
    }

    public Empregado(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()  + "\nSalario: R$" + getSalario();
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}

