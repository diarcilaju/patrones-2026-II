package concrete_decorator;

import component.Bebida;
import decorator.BebidaDecorator;

public class AzucarDecorator extends BebidaDecorator {
    public AzucarDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Azúcar";
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 0.50;
    }
}
