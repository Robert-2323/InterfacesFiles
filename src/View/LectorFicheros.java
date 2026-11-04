package View;

import Controler.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private static final String RUTA_DIR="src/Resources/";
    private static final String RUTA_FILE1="texto_de_prueba_1.txt";
    private static final String RUTA_FILE2="texto_de_prueba_2.txt";

    public Controlador controlador=new Controlador();

    public LectorFicheros() {
        btnCargarFichero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controlador.cargarFichero(txtArea1,RUTA_DIR+RUTA_FILE1);
            }
        });
        btnCargarFichero2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              controlador.cargarFichero(txtArea2,RUTA_DIR+RUTA_FILE2);
            }
        });
        btnComparar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtArea1.getText().isEmpty() || txtArea2.getText().isEmpty() ){
                    JOptionPane.showMessageDialog(null,"No se puede comparar si no hay textos cargados");
                }
                else {
                    controlador.compararTexto(RUTA_DIR + RUTA_FILE1, RUTA_DIR + RUTA_FILE2, txtAreaResultado);
                    txtAreaResultado.setForeground(Color.red);
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
