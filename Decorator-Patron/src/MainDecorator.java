import component.Bebida;
import concrete_component.Cafe;
import concrete_decorator.AzucarDecorator;
import concrete_decorator.LecheDecorator;

public class MainDecorator {
    public static void main(String[] args){
        System.out.println("=== Sistema de pedidos cafetería ===");
        //Pedido 1 sólo café
        Bebida pedido1=new Cafe();
        imprimir(pedido1);

        //Pedido 2 café con leche y azúcar
        Bebida pedido2=new AzucarDecorator(new LecheDecorator(new Cafe()));
        imprimir(pedido2);
    }

    static void imprimir(Bebida b){
        System.out.printf("%-42s S/ %.2f%n", b.getDescripcion(),b.getPrecio());
    }
}
