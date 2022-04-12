package Semana2;

abstract class Sombra{
    abstract void dibujarSombra();
}

class Arma extends Sombra{
    void dibujarSombra(){
        System.out.println("Dibujando sombras...");
    }
}

public class Personaje extends Arma {
    public static void main(String[] args) {
        Sombra flecha = new Personaje();
        Sombra arco = new Arma();

        flecha.dibujarSombra();
        arco.dibujarSombra();
    }

    void dibujarSombra (){
        System.out.println("Dibujando sombra blanca");
    }
}
