/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTipoExamen;


/**
 *
 * @author T-101
 */
public class GenerarClientes{
   public static Clientes[] obtenerClientes(){
        Clientes clientes[]=new Clientes[3];
        clientes[0]=new Clientes("Ana","Lopez",20,20000, new Direccion("Mexico", 133, "5532384201", "nezayork"));
        clientes[1]=new Clientes("Pedro","Perez",45,52000, new Direccion("av.europa", 15, "55188123842", "ecatepec"));        clientes[0]=new Clientes("Ana","Lopez",20,20000, new Direccion("Mexico", 133, "5532384201", "nezayork"));
        clientes[2]=new Clientes("Ana","Lopez",20,20000, new Direccion("carlos hank gonzalez", 58, "5557569201", "las americas"));
//ajustamos nombres
        
        /*clientes[0].setNombre("Ana");
        clientes[1].setNombre("Pedro");
        clientes[2].setNombre("Laura");
        clientes[3].setNombre("Jorge");
        Direccion d1=new Direccion();
        
        d1.setCalle("camino de la liga");
        d1.setNumero(33);
        d1.setMunicipio("Campestre Aragon");
        d1.setTelefono("5532384201");
        clientes[0].setDireccion(d1);*/
             
        return clientes;
   }
}

