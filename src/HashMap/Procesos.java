package HashMap;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Procesos {
    public void iniciar(){
        //arrayList();
        //hashMap();
        mapaDeNotas();
        mapaDePersonas();
    }

    private void mapaDePersonas() {
        HashMap<String, HashMap<String, ArrayList<Double>>> mapPers = new HashMap<String, HashMap<String, ArrayList<Double>>>();
        HashMap<String, ArrayList<Double>> mapEst = new HashMap<String, ArrayList<Double>>();

        ArrayList<Double> listNota1 = new ArrayList<Double>();
        ArrayList<Double> listNota2 = new ArrayList<Double>();
        ArrayList<Double> listNota3 = new ArrayList<Double>();

        listNota1.add(1.3); listNota1.add(2.3); listNota1.add(4.3);
        listNota2.add(4.3); listNota2.add(2.0); listNota2.add(4.0);
        listNota3.add(1.3); listNota3.add(3.3); listNota3.add(5.0);

        mapEst.put("Ingles: ", listNota1);
        mapEst.put("Religion: ", listNota2);
        mapEst.put("Etica: ", listNota3);
        System.out.println(mapEst);

        mapPers.put("111", mapEst);
        mapPers.put("222", mapEst);
        System.out.println(mapPers);
    }

    private void mapaDeNotas() {
        HashMap<String, ArrayList<Double>> mapNotas = new HashMap<String, ArrayList<Double>>();
        ArrayList<Double> listNota1 = new ArrayList<Double>();
        ArrayList<Double> listNota2 = new ArrayList<Double>();
        ArrayList<Double> listNota3 = new ArrayList<Double>();

        listNota1.add(1.4); listNota1.add(1.3); listNota1.add(4.4);
        listNota2.add(1.4); listNota2.add(2.0); listNota2.add(3.4);
        listNota3.add(1.4); listNota3.add(3.5); listNota3.add(1.4);

        mapNotas.put("Español: ", listNota1);
        mapNotas.put("Ingles: ", listNota2);
        mapNotas.put("Matematicas: ", listNota3);

        System.out.println(mapNotas);
    }

    private void hashMap() {
        HashMap<String, String> mapNombres = new HashMap<String, String>();
        mapNombres.put("111", "Duvier");
        mapNombres.put("222", "Duvan");
        mapNombres.put("333", null);
        mapNombres.put("444", "Karol");

        System.out.println(mapNombres);
        System.out.println(mapNombres.get("222"));

        String cedula = JOptionPane.showInputDialog("Ingrese cedula");
        String nombre = JOptionPane.showInputDialog("Ingrese nombre");

        if (mapNombres.get(cedula) == null){
            mapNombres.put(cedula, nombre);
            System.out.println("Persona registrada");
        }else {
            System.out.println("Ya existe la persona: " + mapNombres.get(cedula));
        }

        System.out.println(mapNombres);
    }

    private void arrayList() {
        ArrayList<Integer> miListaInt = new ArrayList<Integer>();
        ArrayList<ArrayList> listaDeListas = new ArrayList<ArrayList>();

        miListaInt.add(21); miListaInt.add(12); miListaInt.add(24); miListaInt.add(55); miListaInt.add(5123);
        System.out.println(miListaInt);
        listaDeListas.add(miListaInt);

        ArrayList<Integer> miListaInt2 = new ArrayList<Integer>();
        miListaInt.add(21);miListaInt.add(12);miListaInt.add(24);miListaInt.add(55);miListaInt.add(5123);
        System.out.println(miListaInt2);
        listaDeListas.add(miListaInt2);

        ArrayList<Integer> miListaInt3 = new ArrayList<Integer>();miListaInt.add(21);miListaInt.add(12);miListaInt.add(24);miListaInt.add(55);miListaInt.add(5123);
        System.out.println(miListaInt3);
        listaDeListas.add(miListaInt3);
    }


}
