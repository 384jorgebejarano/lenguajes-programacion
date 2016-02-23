/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.Threads;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads {
    public static void main(String[] args) {
        //ciclo de vida de los threads sin contar la pausa
        //1. Creado
        MiPrimerThread t1=new MiPrimerThread();
        t1.setName("Monkey D. Luffy");
        //2.Inicializado
        t1.start();
        //3.En ejecucion(cuando corras este programa va a estar en estado de ejecucion)
        //y se active su metodo RUN
        
        //5. Muerte: cuando complete la tarea que tiene el codigo del metodo run
    }
}
