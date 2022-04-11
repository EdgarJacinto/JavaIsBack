package Semana1.Viernes.herencias;

class Persona {
    int id;
    String nombre;

    Persona(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
}

public class Empl extends Persona{
    double salario;


    Empl (int id, String nombre,double salario){
    super(id, nombre);
    this.salario = salario;
    }

    void display (){
        System.out.println(id+ " "+ nombre+" "+salario);
    }

}

class TesterPerEmpl{
    public static void main(String[] args) {
        Empl e = new Empl(1,"Edgar",5000.54);
        e.display();
    }
}
