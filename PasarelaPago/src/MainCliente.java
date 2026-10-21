import adaptee.BancoAntiguo;
import adapter.BancoAdapter;
import client.TiendaApp;
import target.PasarelaPago;

public class MainCliente {
    static void main(String[] args) {
        PasarelaPago pasarela=new BancoAdapter(new BancoAntiguo());
        TiendaApp tienda=new TiendaApp(pasarela);

        tienda.comprar("teclado", 89.90);
    }
}
