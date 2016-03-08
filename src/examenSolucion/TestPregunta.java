/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenSolucion;

/**
 *
 * @author T-101
 */
public class TestPregunta {
    public static void main(String[] args)throws Exception{
        Opcion op1=new Opcion("Moscu", true);
        Opcion op2=new Opcion("Paris", false);
        Opcion op3=new Opcion("Londres", false);
        Opcion op4=new Opcion("Florencia", false);
        Opcion opciones[]=new Opcion[4];
        opciones[0]=op1;
        opciones[1]=op2;
        opciones[2]=op3;
        opciones[3]=op4;
       ValidarOpcion validar=new ValidarOpcion();
       validar.validar(opciones);
        Pregunta p=new Pregunta("capital de russia", opciones);
    }
    
}
