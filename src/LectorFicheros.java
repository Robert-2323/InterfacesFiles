import javax.swing.*;
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

    public LectorFicheros() {
        btnCargarFichero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

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
