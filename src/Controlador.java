import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Controlador {
    public void cargarFichero(JTextArea txtArea,String ruta){
        try(BufferedReader br=new BufferedReader(new FileReader(ruta))){

        }catch (IOException e){
            System.out.println("ERROR: "+e.getMessage());
        }

    }
}
