package decorator;

import component.Bebida;

public abstract class BebidaDecorator implements Bebida {
    //Contiene la bebida que va a decorar
    protected final Bebida bebida;

    public BebidaDecorator(Bebida bebida){
        this.bebida=bebida;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio();
    }
}
