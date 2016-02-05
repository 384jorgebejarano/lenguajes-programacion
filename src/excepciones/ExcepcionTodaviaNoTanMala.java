/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

public class ExcepcionTodaviaNoTanMala {
    public static void main(String[] args) {
        //declaramos un arreglo de enteros
         //Los inicializamos
        
        int x[]={1,34,6,38};
        float []y=new float[4];
        int z=0;
        
         //Todos los arreglos son tratados por el complilador como objetos
     
        A objeto=new A();
        System.out.println(objeto.m);
        System.out.println(y[2]);
        //System.out.println(z);
        //Vmos a iterar el arreglo x
        for(int i=0;i<x.length;i++){
           // System.out.println(x[i]);
        }
        //ciclo for para x mejorado
        
        for(int w:x){
            System.out.println(w);
        }
        
    }
}
class A{
float m;
}
