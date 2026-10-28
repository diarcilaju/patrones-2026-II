package concrete_component;

import component.Bebida;

public class Cafe implements Bebida {
    @Override
    public String getDescripcion() {
        return "Café";
    }

    @Override
    public double getPrecio() {
        return 5.00;
    }
}
