public class Computadora {
    private String procesador;
    private int ram;
    private boolean tieneTarjetaVideo;
    private boolean tieneBluetooth;

    private Computadora(Builder builder){
        this.procesador=builder.procesador;
        this.ram=builder.ram;
        this.tieneTarjetaVideo=builder.tieneTarjetaVideo;
        this.tieneBluetooth=builder.tieneBluetooth;
    }

    public static class Builder{
        private String procesador;
        private int ram;
        private boolean tieneTarjetaVideo;
        private boolean tieneBluetooth;

        public Builder(String procesador, int ram){
            this.procesador=procesador;
            this.ram=ram;
        }

        public Builder setTarjetaVideo(boolean tiene){
            this.tieneTarjetaVideo=tiene;
            return this;
        }

        public Builder setBluetooth(boolean tiene){
            this.tieneBluetooth=tiene;
            return this;
        }
        public Computadora build(){
            return new Computadora(this);
        }
    }


}


