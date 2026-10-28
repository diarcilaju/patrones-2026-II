package concrete_decorator;

import component.Bebida;
import decorator.BebidaDecorator;

public class CremaDecorator extends BebidaDecorator {
    public CremaDecorator(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Crema";
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + 1.00;
    }
}
