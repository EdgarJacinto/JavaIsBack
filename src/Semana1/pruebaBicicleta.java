package Semana1;

public class pruebaBicicleta {
    public static void main (String[] args){
    def();
    }
    public static void def() {
        Bicicleta biciMountain = new Bicicleta();
        biciMountain.setColor("Azul");
        biciMountain.setPins(6);
        biciMountain.setRodada(26);
        biciMountain.setVelocidad(14.5);
        String msg = "Caracteristicas de bicicleta:";
        msg += "\nColor: "+biciMountain.getColor();
        msg += "\nPins: "+biciMountain.getPins();
        msg += "\nRodada: "+biciMountain.getRodada();
        msg += "\nVelocidad: "+biciMountain.getVelocidad();

        System.out.print(msg);
    }


}
