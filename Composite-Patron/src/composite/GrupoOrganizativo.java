package composite;

import component.UnidadOrganizativa;

import java.util.ArrayList;
import java.util.List;

public class GrupoOrganizativo implements UnidadOrganizativa {
    private final String nombre;
    private final String tipo;
    private final List<UnidadOrganizativa> miembros=new ArrayList<>();

    public GrupoOrganizativo(String nombre, String tipo){
        this.nombre=nombre;
        this.tipo=tipo;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public int getPresupuesto() {
        int total=0;
        for(UnidadOrganizativa miembro:this.miembros){
            total+=miembro.getPresupuesto();
        }
        return total;
    }

    @Override
    public List<UnidadOrganizativa> hijos() {
        return this.miembros;
    }

    @Override
    public void mostrar(String indent) {
        System.out.printf("%s+ [%s] %s-> S/ %,d%n", indent,tipo,nombre,getPresupuesto());
        for(UnidadOrganizativa miembro:this.miembros){
            miembro.mostrar(indent+ "   ");
        }
    }

    public void agregar(UnidadOrganizativa u){
        this.miembros.add(u);
    }
    public void remover(UnidadOrganizativa u){
        this.miembros.remove(u);
    }
}
