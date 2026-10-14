public class MainBuilder {
    public static void main(String[] args){
        Computadora computadora=new Computadora.Builder("Intel I9", 32)
                                                .setTarjetaVideo(true)
                                                .setBluetooth(true)
                                                .build();
    }
}
