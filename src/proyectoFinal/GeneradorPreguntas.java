/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoFinal;

import capitulo11.collections.Pregunta;
import java.util.*;
import javax.swing.JRadioButton;

/**
 *
 * @author T-101
 */
public class GeneradorPreguntas {
    public static ArrayList<Pregunta>obtenerTodasLasPreguntas(){
        
        Opcion op1=new Opcion("Moscu", true);
        Opcion op2=new Opcion("Florencia", false);
        Opcion op3=new Opcion("Paris", false);
        Opcion op4=new Opcion("Londres", false); 
        
        Opcion op1p2=new Opcion("Buenos Aires", false);
        Opcion op2p2=new Opcion("Tokio", false);
        Opcion op3p2=new Opcion("Beijing", true);
        Opcion op4p2=new Opcion("Pyongyang", false); 
        
        Opcion op1p3=new Opcion("Monkey D. Luffy", false);
        Opcion op2p3=new Opcion("Bartholomew Kuma", false);
        Opcion op3p3=new Opcion("Trebol", false);
        Opcion op4p3=new Opcion("Donquixote Doflamingo", true); 
        
        Opcion op1p4=new Opcion("Hybrid Teory", false);
        Opcion op2p4=new Opcion("Meteora", true);
        Opcion op3p4=new Opcion("The Hunting Party", false);
        Opcion op4p4=new Opcion("Minutes To Midnight", false);
        
        Opcion op1p5=new Opcion("Pais Noble", false);
        Opcion op2p5=new Opcion("Pantano del Aguila", false);
        Opcion op3p5=new Opcion("Bosque de Chinampinas", false);
        Opcion op4p5=new Opcion("Ombligo de la Luna", true);
        
        Opcion op1p6=new Opcion("2", false);
        Opcion op2p6=new Opcion("10", false);
        Opcion op3p6=new Opcion("7", true);
        Opcion op4p6=new Opcion("13", false);
        
        Opcion op1p7=new Opcion("Negro con una 'U' Amarilla", true);
        Opcion op2p7=new Opcion("Azul con lineas Rojas", false);
        Opcion op3p7=new Opcion("Verde con una teleraña negra", false);
        Opcion op4p7=new Opcion("Morada con una M Blanca", false);
        
        Opcion op1p8=new Opcion("Reptile", false);
        Opcion op2p8=new Opcion("Sub-Zero", false);
        Opcion op3p8=new Opcion("Scorpion", true);
        Opcion op4p8=new Opcion("Ermac", false);
        
        Opcion op1p9=new Opcion("Crono Time", false);
        Opcion op2p9=new Opcion("Crono Destiny", false);
        Opcion op3p9=new Opcion("Crono Gun", false);
        Opcion op4p9=new Opcion("Crono Cross", true);
        
        Opcion op1p10=new Opcion("Chocolate Starfish and the Hotdog Flavored Water", true);
        Opcion op2p10=new Opcion("Stampede of the Disco Elephants", false);
        Opcion op3p10=new Opcion("Results May Vary", false);
        Opcion op4p10=new Opcion("Significant Other", false);
        
        Opcion op1p11=new Opcion("Nunca se creo", false);
        Opcion op2p11=new Opcion("Se robaron la idea de otro juego", false);
        Opcion op3p11=new Opcion("Por creatividad de los diseñadores", false);
        Opcion op4p11=new Opcion("Por un Error", true);
        
        Opcion op1p12=new Opcion("Chloe Frazer", false);
        Opcion op2p12=new Opcion("Nathan Drake", true);
        Opcion op3p12=new Opcion("Victor Sullivan", false);
        Opcion op4p12=new Opcion("Elena Fisher", false);
        
        ArrayList<Opcion> opciones=new ArrayList<Opcion>();
        
        opciones.add(op1);
        opciones.add(op2);
        opciones.add(op3);
        opciones.add(op4);
        
        ArrayList<Opcion> opcionesp2=new ArrayList<Opcion>();
        opcionesp2.add(op1p2);
        opcionesp2.add(op2p2);
        opcionesp2.add(op3p2);
        opcionesp2.add(op4p2);
        
         ArrayList<Opcion> opcionesp3=new ArrayList<Opcion>();
        opcionesp3.add(op1p3);
        opcionesp3.add(op2p3);
        opcionesp3.add(op3p3);
        opcionesp3.add(op4p3);
        
        ArrayList<Opcion> opcionesp4=new ArrayList<Opcion>();
        opcionesp4.add(op1p4);
        opcionesp4.add(op2p4);
        opcionesp4.add(op3p4);
        opcionesp4.add(op4p4);
        
        ArrayList<Opcion> opcionesp5=new ArrayList<Opcion>();
        opcionesp5.add(op1p5);
        opcionesp5.add(op2p5);
        opcionesp5.add(op3p5);
        opcionesp5.add(op4p5);
        
        ArrayList<Opcion> opcionesp6=new ArrayList<Opcion>();
        opcionesp6.add(op1p6);
        opcionesp6.add(op2p6);
        opcionesp6.add(op3p6);
        opcionesp6.add(op4p6);
        
        ArrayList<Opcion> opcionesp7=new ArrayList<Opcion>();
        opcionesp7.add(op1p7);
        opcionesp7.add(op2p7);
        opcionesp7.add(op3p7);
        opcionesp7.add(op4p7);
        
        ArrayList<Opcion> opcionesp8=new ArrayList<Opcion>();
        opcionesp8.add(op1p8);
        opcionesp8.add(op2p8);
        opcionesp8.add(op3p8);
        opcionesp8.add(op4p8);
        
        ArrayList<Opcion> opcionesp9=new ArrayList<Opcion>();
        opcionesp9.add(op1p9);
        opcionesp9.add(op2p9);
        opcionesp9.add(op3p9);
        opcionesp9.add(op4p9);
        
        ArrayList<Opcion> opcionesp10=new ArrayList<Opcion>();
        opcionesp10.add(op1p10);
        opcionesp10.add(op2p10);
        opcionesp10.add(op3p10);
        opcionesp10.add(op4p10);
        
        ArrayList<Opcion> opcionesp11=new ArrayList<Opcion>();
        opcionesp11.add(op1p11);
        opcionesp11.add(op2p11);
        opcionesp11.add(op3p11);
        opcionesp11.add(op4p11);
        
        ArrayList<Opcion> opcionesp12=new ArrayList<Opcion>();
        opcionesp12.add(op1p12);
        opcionesp12.add(op2p12);
        opcionesp12.add(op3p12);
        opcionesp12.add(op4p12);
        
        Pregunta p1=new Pregunta("Capital De Rusia", opciones);
        Pregunta p2=new Pregunta("Cual es la Capital de China", opcionesp2);
        Pregunta p3=new Pregunta("De la serie de anime One Piece quien es el usuario de la fruta 'ito ito no mi'", opcionesp3);
        Pregunta p4=new Pregunta("De la Banda de Rock Aletrnativo Linkin Park de que album es la cancion Numb", opcionesp4);
        Pregunta p5=new Pregunta("Que significa Mexico en Nahuatl", opcionesp5);
        Pregunta p6=new Pregunta("Del anime Dragon Ball cuantas esferas del dragon se tienen que reunir para invocar a Shenlong", opcionesp6);
        Pregunta p7=new Pregunta("Del Videojuego Pokémon de que color es la Ultra Ball", opcionesp7);
        Pregunta p8=new Pregunta("Del Videojuego Mortal Kombat como se llama el personaje denominado como 'el ninja amarillo'", opcionesp8);
        Pregunta p9=new Pregunta("Como se llama la secuela del videojuego Crono-Trigger", opcionesp9);
        Pregunta p10=new Pregunta("De la Banda de Nu Metal Limp Bizkit de que album es la cancion Take A Look Around", opcionesp10);
        Pregunta p11=new Pregunta("Del Videojuego Mortal Kombat como se creo al personaje ERMAC", opcionesp11);
        Pregunta p12=new Pregunta("Como se llama el personaje principal de la serie de Videojuegos Uncharted", opcionesp12);
        
        ArrayList<Pregunta> preguntas=new ArrayList<Pregunta>();
        
        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        preguntas.add(p10);
        preguntas.add(p11);
        preguntas.add(p12);
        return preguntas;
    }
    public static boolean checarRespuesta(Pregunta p, JRadioButton[] radios){
        boolean respuesta=false;
        String seleccion="";
        for(JRadioButton radio:radios){
            if(radio.isSelected()){
                seleccion= radio.getText();
            }
        }
        for(Opcion o:p.getOpciones()){
            if(o.isEstatus()){
                if(o.getTitulo().equals(seleccion))respuesta=true;
            }
        }
        return respuesta;
        
    }
}
