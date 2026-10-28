package concrete_decorator;

import component.Bebida;
import decorator.BebidaDecorator;

public class LecheDecorator extends BebidaDecorator {
    public LecheDecorator(Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Leche";
    }

    @Override
    public double getPrecio() {
        return super.getPrecio()+0.8;
    }
}
