import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Random; 

/*
La clase Interfaz es la encargada de dibujar el treemap
 */
public class Interfaz extends JFrame {

    JFrame ventana;// Ventana del juego
    JPanel panel;// Panel del juego
    
    /*
    Contructor, recibe el tamano de la ventana
     */
    public Interfaz(int tamano) {
        this.ventana(tamano);
    }

    /*
    Crea la ventana y agrega el panel
     */
    public void ventana(int tamano) {
        this.ventana = new JFrame();
        this.ventana.setTitle("TreeMap");
        this.ventana.setSize(tamano, tamano);
        this.ventana.setLocationRelativeTo(null);
        this.ventana.setLayout(null);
        this.ventana.setResizable(false);
        this.ventana.setVisible(true);
        this.ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new JPanel();
        this.panel.setBounds( tamano, tamano, 0, 0);
        this.ventana.add(panel);
        this.ventana.setContentPane(panel);
    }

    /*
    Dibuja los botones en el panel
     */
    public void dibujarPanel(String texto, int x, int y, int largo, int ancho) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	Random rand = new Random(); 
            	float r = rand.nextFloat(); 
				float g = rand.nextFloat(); 
				float b = rand.nextFloat();
				Color randomColor = new Color(r, g, b);
                JButton botonIndividual = new JButton();
                botonIndividual.setText(texto);
                botonIndividual.setBounds(x, y, largo, ancho);
                botonIndividual.setBackground(randomColor);
                panel.add(botonIndividual);
                panel.repaint();
                panel.repaint();
            }
        });
    }

}
