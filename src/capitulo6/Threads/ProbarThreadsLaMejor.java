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
public class ProbarThreadsLaMejor {
    //esta es la forma numero 3 "la mejor"
    //Una clase interna anonima se apega donde se requiera una refenrencia dentro de un 
    //constructor o un metodo.
    public static void main(String[] args) {
        Thread t2=new Thread(new Runnable(){

            @Override
            public void run() {
                int x=0;
            for(int i=0;i<=30;i++){
                System.out.println(x++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
                }
            
        });
        t2.start();
        Thread t3=new Thread(new Runnable(){

            @Override
            public void run() {
                while(true){
                System.out.println("Todos Vamos a Morir!!!!!!!!!!!!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProbarMisThreads.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                }
            
        });
        t3.start();        
    }
    
}
