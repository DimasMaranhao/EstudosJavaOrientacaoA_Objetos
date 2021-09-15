/* package JavaOOPNext;
public class AppConta {
    public static void main(String[] args) throws Exception {
        Conta contaDoDaniel = new Conta();
        contaDoDaniel.agencia = "0001";
        contaDoDaniel.numero = "456456-7";
        contaDoDaniel.saldo = 100000.0;
        
        //OU
        //Conta2 contaDoDaniel = new Conta2 ("456456-7", "0001", 100000.0);

        //Saque
        System.out.println("Saldo antes do saque: " + contaDoDaniel.saldo);
        contaDoDaniel.debitarSaldo(1500.0);
        System.out.println("Saldo depois do saque: " + contaDoDaniel.saldo);

        System.out.println("\n" + "-----------------------------------------"+ "\n");

        Conta contaBBdoDaniel = new Conta();
        contaBBdoDaniel.agencia = "0001";
        contaBBdoDaniel.numero = "456456-7";
        contaBBdoDaniel.saldo = 0.0;

        //OU
        //Conta2 contaDoDaniel = new Conta2 ("456456-7", "0001", 100000.0);

        //Saque
        System.out.println("Saldo antes do saque: " + contaBBdoDaniel.saldo);
        contaBBdoDaniel.debitarSaldo(1500.0);
        System.out.println("Saldo depois do saque: " + contaBBdoDaniel.saldo);

    }
    
}
 */