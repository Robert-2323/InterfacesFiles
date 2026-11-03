import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LectorFicheros {
    private JPanel ventana;
    private JButton btnCargarFichero;
    private JButton btnCargarFichero2;
    private JButton btnComparar;
    private JTextArea txtArea1;
    private JTextArea txtArea2;
    private JTextArea txtAreaResultado;
    private JScrollPane ScrollPanel1;
    private JScrollPane ScrollPanel2;
    private JScrollPane ScrollPanel3;
    private static final String RUTA_DIR="Ficheros/";
    private static final String RUTA_FILE1="texto_de_prueba_1.txt";
    private static final String RUTA_FILE2="texto_de_prueba_2.txt";

    public LectorFicheros() {
        btnCargarFichero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea1.setLineWrap(true);        // Activa el ajuste de línea automático
                txtArea1.setWrapStyleWord(true);
                try(BufferedReader br=new BufferedReader(new FileReader(RUTA_DIR+RUTA_FILE1))){

                    String line;

                    while ((line=br.readLine())!=null){
                        txtArea1.append(line);

                    }
                }catch (IOException f){
                    System.out.println("ERROR: "+f.getMessage());
                }
            }
        });
        btnCargarFichero2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtArea2.setLineWrap(true);
                txtArea2.setWrapStyleWord(true);
                try(BufferedReader br=new BufferedReader(new FileReader(RUTA_DIR+RUTA_FILE2))){

                    String line;

                    while ((line=br.readLine())!=null){
                        txtArea2.append(line);

                    }
                }catch (IOException f){
                    System.out.println("ERROR: "+f.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("LectorFicheros");
        frame.setContentPane(new LectorFicheros().ventana);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
