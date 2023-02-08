package poo.clases;

import poo.herencia.Camion;
import poo.herencia.Coche;
import poo.herencia.Motocicleta;

public class Main {

    public static void main(String[] args) {    //modificador static indica que el metodo main pertenece a una clase y permite acceder a su contenido sin crear objetos

        // Clase identificador = new Clase(); creacion de objetos

        //creacion de objetos con constructor vacio
        Vehiculo toyotaPrius = new Vehiculo();

        //creacion de objetos con el constructor de parametros

        Motor motorGTI      = new Motor("GTI",190,459.0,6);
        Vehiculo fordMondeo = new Vehiculo("Ford","mondeo",2.1,2010,false,0,motorGTI);
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.modelo);
        System.out.println(fordMondeo.cc);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.sport);
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);

        //Herencia
        Motocicleta italika = new Motocicleta();

        italika.fabricante  = "Elektra";

        System.out.println("Fin del programa ");

        //Polimorfismo

        Vehiculo vehiculo;

        vehiculo = new Motocicleta();
        vehiculo.acelerar(20);

        vehiculo = new Camion();
        vehiculo.acelerar(10);

        vehiculo = new Coche();
        vehiculo.acelerar(30);

        //Clases abstractas no se peuden instanciar solo se instacian clases hijas



    }
}
