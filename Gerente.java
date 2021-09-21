package ImersaoAula01.src.JavaOOPNext.Aula3.CadastroEmpregados;

public class Gerente extends Empregado {

    public String departamento;

    public Gerente (String nome, Double salario, String departamento){
        super (nome, salario);
        this.departamento = departamento;               
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome()  + "\nGerente de: " + getDepartamento() + "\nSalario: R$" + super.getSalario();
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
