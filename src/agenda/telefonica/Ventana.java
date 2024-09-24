package agenda.telefonica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame {

    JPanel panel = new JPanel();
    JTextField txtvalor = new JTextField();
    JTextField txtvalor2 = new JTextField();
    JTextField txtvalor3 = new JTextField();
    JLabel lblresultado = new JLabel();
    int valor = 0;
    char simbolos = ' ';

    public Ventana() {
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void inserpanel() {
        this.getContentPane().add(panel);
        panel.setLayout(null);

    }

    public void textos() {
        txtvalor.setBounds(250, 50, 190, 50);
        panel.add(txtvalor);
        txtvalor.repaint();
        
        txtvalor2.setBounds(250, 150, 190, 50);
        panel.add(txtvalor2);
        txtvalor2.repaint();
        
        txtvalor3.setBounds(250, 250, 190, 50);
        panel.add(txtvalor3);
        txtvalor3.repaint();
    }
    
    public void botones(){
        JButton btn1 = new JButton("Guardar");
        btn1.setBounds(500, 70, 100, 30);
        panel.add(btn1);
        btn1.repaint();
        
        JButton btn2 = new JButton("Buscar");
        btn2.setBounds(650, 70, 100, 30);
        panel.add(btn2);
        btn2.repaint();
        
        JButton btn3 = new JButton("Eliminar");
        btn3.setBounds(650, 200, 100, 30);
        panel.add(btn3);
        btn3.repaint();
        
        JButton btn4 = new JButton("Actualizar");
        btn4.setBounds(500, 200, 100, 30);
        panel.add(btn4);
        btn4.repaint();
    }

    public void Etiquetas (){
        
    }
}
