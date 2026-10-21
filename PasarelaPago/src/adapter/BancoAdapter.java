package adapter;

import adaptee.BancoAntiguo;
import target.PasarelaPago;

public class BancoAdapter implements PasarelaPago {
    private final BancoAntiguo banco;

    public BancoAdapter(BancoAntiguo banco){
        this.banco=banco;
    }

    @Override
    public boolean pagar(double monto) {
        int centimos= (int) Math.round(monto*100);
        String respuesta= banco.procesarCobro(centimos);
        return respuesta.equals("OK");
    }
}
