package adaptee;

public class BancoAntiguo {
    public String procesarCobro(int montoCentimos){
        System.out.println("Banco Antiguo Cobrando " + montoCentimos + " Céntimos");
        return montoCentimos>0 ? "OK" : "ERROR";
    }
}