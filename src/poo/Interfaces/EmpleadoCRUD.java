package poo.Interfaces;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoCRUD {

    private List<Empleado> empleados = new ArrayList<>();

    //Guardar empleado
    public void guardar(Empleado empleado){
        empleados.add(empleado);
    }

    public List<Empleado> findall() {
        return empleados;
    }
}
