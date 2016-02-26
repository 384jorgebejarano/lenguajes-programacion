/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo6.Threads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T-101
 */
public class ProbarMisThreads implements Runnable{
    public static void main(String[] args) {
        //ciclo de vida de los threads sin contar la pausa
        //1. Creado
        MiPrimerThread t1=new MiPrimerThread();
        //Otro Thread
        Runnable r=new ProbarMisThreads();
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        //el thread t2 tiene que hacer que se impriman del 1 al 10
        //de 5 segundos entre impresion
        //El thread t3 tiene que hacer que se imprima la frase "todos vamos a morir!!" hasta el final de los tiempos
        //cada segundo
        //Opcionalmente lo Bautizamos
        t1.setName("Monkey D. Luffy");
        t2.setName("Roronoa Zoro");
        t3.setName("Sanji Vinsmoke");
        //2.Inicializado
        t1.start();
        t2.start();
        t3.start();
        //3.En ejecucion(cuando corras este programa va a estar en estado de ejecucion)
        //y se active su metodo RUN
        
        //5. Muerte: cuando complete la tarea que tiene el codigo del metodo run
    }

    @Override
    public void run() {
        //primero preguntamos si es el thread t2 y si que improima del 1 al 10
        if(Thread.currentThread().getName().equals("Roronoa Zoro")){
            int x=0;
            for(int i=0;i<=30;i++){
                System.out.println(x++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }if(Thread.currentThread().getName().equals("Sanji Vinsmoke")){
            while(true){
                System.out.println("Todos Vamos a Morir!!!!!!!!!!!!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        }
}
