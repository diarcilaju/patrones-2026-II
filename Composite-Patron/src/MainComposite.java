import composite.GrupoOrganizativo;
import leaf.Empleado;

public class MainComposite {
    public static void main(String[] args){
        System.out.println("=== Patrón Composite - Presupuesto ====");
        //Hojas empleado
        Empleado ana=new Empleado("Ana","Dev Senior",8000);
        Empleado luis=new Empleado("Luis","Dev Junior",6000);
        Empleado sara=new Empleado("Sara","UI Designer",5000);
        Empleado pedro=new Empleado("Pedro","QA",3000);
        Empleado rosa=new Empleado("Rosa","Vendedora",7000);
        Empleado carlos=new Empleado("Carlos","Vendedor",5000);
        //Equipos nivel 3
        GrupoOrganizativo backend=new GrupoOrganizativo("Backend","Equipo");

    }
}
