public class MainSingleton {
    public static void main(String[] args){
        Singleton primeraInvocacion= Singleton.getInstance();
        Singleton segundaInvocacion=Singleton.getInstance();

        System.out.println("Primera invocación al método: "+ primeraInvocacion);
        System.out.println("Segunda invocación al método: "+ segundaInvocacion);
    }
}