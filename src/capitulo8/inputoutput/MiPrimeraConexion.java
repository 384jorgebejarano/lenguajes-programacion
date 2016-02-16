/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo8.inputoutput;
import java.net.*;
import java.io.*;
/**
 *
 * @author T-101
 */
public class MiPrimeraConexion {
    public static void main(String[] args) throws Exception{
        URL url=new URL("http://www.weatherlink.com/user/sierraguadalupe/index.php?view=summary&headers=0");
        HttpURLConnection con=(HttpURLConnection) url.openConnection();
        InputStream input=con.getInputStream();
        InputStreamReader isr=new InputStreamReader(input);
        BufferedReader reader=new BufferedReader(isr);
        int renglones=0;
        boolean encontrado=false;
        String temperaturas[]=new String[5];
        String renglonActual=reader.readLine();
        if(renglonActual.contains("Outside Te")){
            encontrado=true;
            System.out.println("Si existe el renglon");
        }
        while(reader.readLine() != null){
            renglones++;
            
            //if(reader.readLine().contains("summary_timestamp") || renglones==100){
                //System.out.println(reader.readLine());
            }
           /* String hola="<td width=class summary_data>19.6 C<td>";
            int indice1= hola.indexOf("summary_data");
            int indice2= hola.indexOf("<td>");
            String nuevo=hola.substring(indice1+13,indice2);
            System.out.println(nuevo);
            
            String hola2="<td colspan=6 class=summary_timestamp>Current Conditions as of 19:40 Monday, February 15, 2016</td>";
            int indice3= hola2.indexOf("summary_timestamp");
            int indice4= hola2.indexOf("</td>");
            String nuevo2=hola2.substring(indice3+43,indice4);
            System.out.println(nuevo2);
                   */
        }
    
        //System.out.println("Numero de Renglones "+renglones);
    }

