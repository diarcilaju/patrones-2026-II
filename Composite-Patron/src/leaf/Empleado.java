package leaf;

import component.UnidadOrganizativa;

import java.util.Collections;
import java.util.List;

public class Empleado implements UnidadOrganizativa {
    private final String nombre;
    private final String cargo;
    private final int salario;

    public Empleado(String nombre, String cargo, int salario){
        this.nombre=nombre;
        this.cargo=cargo;
        this.salario=salario;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getTipo() {
        return this.cargo;
    }

    @Override
    public int getPresupuesto() {
        return this.salario;
    }

    @Override
    public List<UnidadOrganizativa> hijos() {
        return Collections.emptyList();
    }

    @Override
    public void mostrar(String indent) {
        System.out.printf("%s - %-10s %-18s S/ %,d%n", indent,nombre,"("+cargo+")",salario);
    }
}
