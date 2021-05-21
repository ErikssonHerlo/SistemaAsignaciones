/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import estructuras.TablaHash;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import objetos.Estudiante;

/**
 *
 * @author erikssonherlo
 */
public class Graficadora {
    TablaHash<Estudiante> array =   EstructuraGeneral.getTablaEstudiante();
    ArrayList<Estudiante> aux = EstructuraGeneral.getEstudiantes();
    
    
    public String dotCodeTablaHash() {
        String codigo = "";
        codigo += "digraph G {\n";
        codigo += "nodesep=.05;\nrankdir=LR;\nnode[shape=record,width=.1,height=.1];\n";
        codigo += "\n\n";
        codigo += "nodeo0 [label = \"";
        for(int i = 0; i < aux.size(); i++) {
            codigo += "<f" + i + "> | ";
        }
        codigo += "\", height=2.5];\n";
        
        codigo += "node [width = 1.5];\n";
        for(int i = 0; i < aux.size(); i++) {
            if(aux.get(i) != null) {
                codigo += "nodo" + i + "[label = \"{ <n> " + String.valueOf(aux.get(i).getId()) + "-" + aux.get(i).getNombre() + "-" + aux.get(i).getDireccion() +  "}\"];\n";
            }
        }
        
        for(int i = 0; i < aux.size(); i++) {
            if(aux.get(i) != null) {
                codigo += "nodeo0:f" + i +" -> nodo" + i + ":n;\n" ;
            }
        }
        
        codigo += "\n}";
        return codigo;
    }
    
     
}
