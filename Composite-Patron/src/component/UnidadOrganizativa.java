package component;

import java.util.List;

public interface UnidadOrganizativa {
    String getNombre();
    String getTipo();
    int getPresupuesto();
    List<UnidadOrganizativa> hijos();
    void mostrar(String indent);
}
