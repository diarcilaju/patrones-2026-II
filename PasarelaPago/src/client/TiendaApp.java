package client;

import target.PasarelaPago;

public class TiendaApp {
    private PasarelaPago pasarela;

    public TiendaApp(PasarelaPago pasarela){
        this.pasarela=pasarela;
    }

    public void comprar(String producto, double precio){
        boolean ok=pasarela.pagar(precio);
        System.out.println(producto + ": "+ (ok? " pago aprobado.": " pago rechazado."));
    }
}
