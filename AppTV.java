package JavaOOPNext.ExerciciosOrientParaObjetos;

public class AppTV {
    public static void main(String[] args) {
        Televisao televisaoDeCasa = new Televisao();
        televisaoDeCasa.canal = 19;
        televisaoDeCasa.programa = "Tela Quente";
        televisaoDeCasa.volume = 20;
        televisaoDeCasa.ligada = false;
        televisaoDeCasa.smarTV = null;

        
        System.out.println("Situação antes do método: OFF");
        System.out.println("\n------------------------------\n");
        televisaoDeCasa.ligarTelevisao(true);
        
        System.out.println("\n------------------------------\n");
        System.out.println("Situação antes de mudar SmarTV: " + televisaoDeCasa.smarTV);
        System.out.println("\n------------------------------\n");
        televisaoDeCasa.ligarSmarTV(null);
    }
}