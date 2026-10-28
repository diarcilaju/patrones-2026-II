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
        backend.agregar(ana);
        backend.agregar(luis);
        GrupoOrganizativo frontend=new GrupoOrganizativo("Frontend","Equipo");
        frontend.agregar(sara);
        frontend.agregar(pedro);
        GrupoOrganizativo comercial=new GrupoOrganizativo("Comercial","Equipo");
        comercial.agregar(rosa);
        comercial.agregar(carlos);
        GrupoOrganizativo tecnologia=new GrupoOrganizativo("Tecnología","Departamento");
        tecnologia.agregar(backend);
        tecnologia.agregar(frontend);
        GrupoOrganizativo ventas=new GrupoOrganizativo("Ventas","Departamento");
        ventas.agregar(comercial);
        GrupoOrganizativo techCorp=new GrupoOrganizativo("TechCorp","Empresa");
        techCorp.agregar(tecnologia);
        techCorp.agregar(ventas);
        techCorp.mostrar("   ");
    }
}
