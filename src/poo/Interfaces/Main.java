package poo.Interfaces;

import java.util.List;

public class Main {

    public static void main(String[] args) {

      EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

      Empleado juanito = new Empleado("Juan",30,225.20,true);
      Empleado roberto = new Empleado("Roberto",26,399.9,false);
      Empleado tono = new Empleado("Toño",29,228.98,true);

      empleadoCRUD.guardar(juanito);
      empleadoCRUD.guardar(roberto);
      empleadoCRUD.guardar(tono);

      List<Empleado> empleados =  empleadoCRUD.findall();
        System.out.println(empleados);

    }
}
