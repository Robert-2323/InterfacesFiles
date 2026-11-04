package Controler;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Controlador {

    public Controlador(){}

    public void cargarFichero(JTextArea txtArea,String ruta){
        try(BufferedReader br=new BufferedReader(new FileReader(ruta))){

            String line;
            while ((line=br.readLine())!=null){
                txtArea.append(line+"\n");

            }
        }catch (IOException f){
            System.out.println("ERROR: "+f.getMessage());
        }

    }

    public void compararTexto(String ruta1,String ruta2,JTextArea txtResultado){
       try(BufferedReader br1=new BufferedReader(new FileReader(ruta1));
            BufferedReader br2=new BufferedReader(new FileReader(ruta2))) {

           String line;
           String line2;

           ArrayList<String> lineas1 =new ArrayList<>();
           ArrayList<String> lineas2 =new ArrayList<>();


           while ((line=br1.readLine())!=null){
               lineas1.add(line);
           }
           while ((line2=br2.readLine())!=null){
               lineas2.add(line2);
           }




           for (int i = 0; i < lineas1.size(); i++) {
               String l1=lineas1.get(i);
               String l2=lineas2.get(i);

               int minimaLength=(Math.min(l1.length(),l2.length()));
               for (int j = 0; j <minimaLength ; j++) {
                   char car1 = l1.charAt(j);
                   char car2 = l2.charAt(j);

                   if (car1 != car2) {
                       txtResultado.append("Linea: "+(i+1)+" Caracter: "+(j+1)+","+car1+" <> "+car2+"\n");
                   }
               }
           }
       }catch (IOException e){
           System.out.println("ERROR: "+e.getMessage());
       }

    }
}
