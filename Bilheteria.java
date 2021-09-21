package ImersaoAula01.src.JavaOOPNext.Aula3.Ingresso;

public class Bilheteria {
    
 
    public static void main (String[] args) {
        Ingresso ingresso = new Ingresso(40.0);
        Ingresso ingressoDois = new Ingresso(40.0);
        Ingresso ingressoVIP = new IngressoVIP (40.0, 100.0);

        System.out.println(ingresso);
        System.out.println(ingressoVIP);

        System.out.println("Os ingressos são iguais? " + ingressoDois.equals(ingresso));
        System.out.println("Os ingressos são iguais? " + (ingressoDois == ingresso));

        System.out.println("Os ingressos são iguais? " + ingressoVIP.equals(ingresso));

    }
}
