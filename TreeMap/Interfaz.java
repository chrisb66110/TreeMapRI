import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
La clase Interfaz es la encargada de tener los elementos necesario para la comunicacion con el usuario
 */
public class Interfaz extends JFrame {

    JFrame ventana;//ventana del juego
    JPanel panel;
    
    /*
    Recibe la instancia(Juego) con la que se quiere comunicar
    Encargado de construir instancias de Interfaz con los atributos llenos
    No retorna
     */
    public Interfaz(int tamano) {
        this.ventana(tamano);
    }

    /*
    No recibe
    Encargado de crear la ventana del juego
    No retorna
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
        //this.panel.setBackground(Color.GREEN);
        this.ventana.add(panel);
        this.ventana.setContentPane(panel);
    }

    /*
    Recibe la direccion(String) de la imagen del panel
    Encargado de crear el panel para que el jugador seleecione el tipo de partida deseado
    No retorna
     */
    public void dibujarPanel(String texto, int x, int y, int ancho, int alto) {
        System.out.println("Cree el boton: " + texto);
        JButton botonIndividual = new JButton();
        botonIndividual.setText(texto);
        botonIndividual.setBounds(x, y, ancho, alto);
        this.panel.add(botonIndividual);
        this.panel.repaint();
        this.panel.repaint();
        //this.panel.updateUI();
        //this.ventana.paintAll(ventana.getGraphics());
        //this.ventana.add(panel);
        //this.ventana.setContentPane(panel);
    }

}
