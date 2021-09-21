package ImersaoAula01.src.JavaOOPNext.Aula3.CadastroEmpregados;

public class MostraInformacoes {
    public static void main(String[] args) {
        Empregado empregadoUm = new Empregado("Zé Ninguém", 1104.0);        
        Gerente gerenteUm = new Gerente("Mizer Ávi", 4500.0, "Finanças");
        Vendedor vendedorUm = new Vendedor ("Cába Bom", 1350.0, 0.10);


        System.out.println(empregadoUm + "\n");        
        System.out.println(gerenteUm + "\n");
        System.out.println(vendedorUm + "\n");
    }      
}
