package Semana1.Viernes.herencias;

public class Empleado {
    double salario = 40500;
}
class programador extends Empleado {
    int bono = 2000;
    public void main(){
    programador Edgar = new programador();
        System.out.println("El salario del papusho es de: "+ Edgar.salario+"\n"+
                "Con un bono de: "+Edgar.bono);
    }
    void mensaje (){
        System.out.println("Soy programador paps :p");
        main();
    }
}

class  web extends programador{
    public static void main(String[] args) {
        web w = new web();
        w.mensaje();
    }
}
