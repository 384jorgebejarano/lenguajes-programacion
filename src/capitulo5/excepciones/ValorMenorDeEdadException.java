/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo5.excepciones;

/**
 *
 * @author T-101
 */
public class ValorMenorDeEdadException extends Exception{

    public ValorMenorDeEdadException(String message) {
        super("No te puedes registrar eres menor de edad");
    }
    
}
