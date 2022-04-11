package POO;

import javax.swing.*;

public class Operacion {
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    float division;

    public void scannum (){
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
    }

    public void sumar (){
        suma = numero1+numero2;
    }
    public void restar(){
        resta = numero1-numero2;
    }
    public void dividir(){
        division = numero1/numero2;
    }
    public void multiplicar(){
        multiplicacion = numero1*numero2;
    }
    public void mostrarResultados(){
        System.out.println("La suma es : "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La división es: "+division);
        System.out.println("La multiplicación es: "+multiplicacion);
    }
}
