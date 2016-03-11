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
public class ProbarPregunta {
    public static void main(String[] args) {
        ArrayList<Pregunta> preguntas=GeneradorPreguntas.obtenerTodasLasPreguntas();
        for(Pregunta p:preguntas){
            System.out.println("Pregunta: "+p.getTitulo());
            for(Opcion o:p.getOpciones()){
                System.out.println(o.getTitulo()); 
            }
        }
    }
    
}