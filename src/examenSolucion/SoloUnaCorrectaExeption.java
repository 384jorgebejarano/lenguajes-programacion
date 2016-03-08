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
public class SoloUnaCorrectaExeption extends Exception{

    public SoloUnaCorrectaExeption() {
        super("Solo Se Puede Elegir Una Opcion Correcta");
    }
    
}
