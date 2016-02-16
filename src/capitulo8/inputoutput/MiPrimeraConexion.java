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
        while(reader.readLine() != null){
            renglones++;
            //if(reader.readLine().contains("summary_timestamp") || renglones==100){
                //System.out.println(reader.readLine());
            }
            String hola="<td width=170 class=summary_data>21.1 C<td>";
            int indice1= hola.indexOf("summary_data");
            int indice2= hola.indexOf("</td>");
            String nuevo=hola.substring(indice1,indice2);
            System.out.println();
        }
    
        //System.out.println("Numero de Renglones "+renglones);
    }

