/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo11.collections;

import java.util.*;

/**
 *
 * @author T-101
 */
public class GeneradorPreguntas {
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        
        Opcion op1=new Opcion("Moscu", true);
        Opcion op2=new Opcion("Florencia", false);
        Opcion op3=new Opcion("Paris", false);       
        
        ArrayList<Opcion> opciones=new ArrayList<Opcion>();
        
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        
        Pregunta p1=new Pregunta("Capital De Rusia", opciones);
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        preguntas.add(p1);
        return preguntas;
    }
}