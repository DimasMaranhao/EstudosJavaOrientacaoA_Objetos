package JavaOOPNext.ExerciciosOrientParaObjetos.Exercicio02;

public class Veiculo {
    public Boolean automotor;
    public String tipo;
    public String cor;
    public String placa;
    public Integer ano;
    public Double valor;
    private Boolean multas;
    private Double valorMultas;    


public Veiculo (Boolean automotor, String tipo, String cor, String placa, Integer ano, Double valor, Boolean multas, Double valorMultas){
    this.automotor = true;
    this.tipo = "automóvel";
    this.cor = "branco";
    this.placa = "ABC-1234";
    this.ano = 2015;
    this.valor = 30000.0;
    this.multas = true;
    this.valorMultas = 254.8;
}

public Veiculo (Boolean automotor, String tipo, String cor, String placa, Integer ano, Double valor, Boolean multas){
    this.automotor = true;
    this.tipo = "motocicleta";
    this.cor = "preto";
    this.placa = "XYZ-4321";
    this.ano = 2018;
    this.valor = 6000.0;
    this.multas = false;    
}

public Veiculo (Boolean automotor, String tipo, String cor, Integer ano, Double valor){
    this.automotor = false;
    this.tipo = "bicicleta";
    this.cor = "preto e laranja";
    this.placa = "Não se aplica";
    this.ano = 2020;
    this.valor = 2000.0;     
}

public void mostarInformacoes (){
    System.out.println("INFORMAÇÕES do VEÍCULO:");
    System.out.println("---------------------------");
    System.out.println("Veículo automotor: "+ automotor);
    System.out.println("Tipo do veículo: "+ tipo);
    if (automotor == true){
        System.out.println("Placa: "+ placa);        
        }
    System.out.println("Cor do veículo: "+ cor);
    System.out.println("Ano: "+ ano);
    System.out.println("Valor do veículo: R$"+ valor);
    if (multas == true && tipo == "carro" || multas == true && tipo == "motocicleta"){
        System.out.println("Multas devidas: R$"+valorMultas);
    } else {
        System.out.println("Multas devidas: Não aplicável");
    }
    
    
}

}


