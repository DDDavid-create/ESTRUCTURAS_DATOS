package HashMap.Ejercicio1;

import javax.swing.*;
import java.util.HashMap;
import java.util.Iterator;

public class Procesos {
    /*Haga un sistema que permita registrar estudiantes por su cedula.
    * El sistema deberá permitir:
    * - Consultar estudiantes registrados
    * - Consultar estudiante por cedula
    * - Modificar el nombre del estudiante
    * BONUS: Permita registrar notas por cada estudiante
    * */

    HashMap<String, String> mapEst = new HashMap<String, String>();
    public void iniciar(){
        JOptionPane.showMessageDialog(null, "Bienvenid@");
        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué desea hacer? \n\n0. Salir \n1. Registrar estudiantes" +
                    "\n2. Consultar estudiante por cedula" +
                    "\n3. Consultar todos los estudiantes" +
                    "\n4. Modificar el nombre del estudiante" +
                    "\n\nElija una opcion valida por favor"));

            switch (opcion){
                case 1:
                    registroEstudiante();
                    break;
                case 2:
                    consultarEstudianteCedula();
                    break;
                case 3:
                    consultarEstudiantes();
                    break;
                case 4:
                    modificarNombreEst();
                    break;
            }

        }while (opcion!=0);
    }

    private void modificarNombreEst() {
        String cedula = JOptionPane.showInputDialog("Ingrese la cedula de quien necesite modificar el nombre");
        String res = mapEst.get(cedula);

        JOptionPane.showMessageDialog(null, "El estudiante ingresado es: " + res);
        String cambio = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
        mapEst.put(cedula, cambio);

    }

    private void consultarEstudiantes() {
        Iterator<String> itera=mapEst.keySet().iterator();
        System.out.println(itera);

        while (itera.hasNext()){
            String clave=itera.next();
            JOptionPane.showMessageDialog(null, clave + " - " + mapEst.get(clave));
            System.out.println(clave+" - "+mapEst.get(clave));
        }

    }

    private void consultarEstudianteCedula() {
        String cedula = JOptionPane.showInputDialog("Ingrese la cedula del estudiante a consultar");
        JOptionPane.showMessageDialog(null, mapEst.get(cedula));
    }

    private void registroEstudiante() {
        String cedula = JOptionPane.showInputDialog("Ingrese su cedula");
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        mapEst.put(cedula, nombre);
        JOptionPane.showMessageDialog(null, "Registro exitoso!");
    }
}
