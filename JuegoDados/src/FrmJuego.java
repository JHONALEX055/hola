import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame {

    private JButton btnIniciar;
    private JButton btnLanzar;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel lblCenas;
    private JLabel lblDado1;
    private JLabel lblDado2;
    private JLabel lblLanzamientos;

    private Dado dado1, dado2;
    private Random r = new Random();

    public FrmJuego() {
        setSize(600, 300);
        setTitle("Juego de Dados");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        lblDado1 = new JLabel();
        lblDado2 = new JLabel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        lblLanzamientos = new JLabel();
        lblCenas = new JLabel();
        btnLanzar = new JButton();
        btnIniciar = new JButton();

        String nombreArchivo = "/imagenes/1.jpg";
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreArchivo));
        lblDado1.setBounds(10, 10, imagen.getIconWidth(), imagen.getIconHeight());
        lblDado2.setBounds(20 + imagen.getIconWidth(), 10, imagen.getIconWidth(), imagen.getIconHeight());
        lblDado1.setIcon(imagen);
        lblDado2.setIcon(imagen);

        jLabel1.setBounds(50 + 2 * imagen.getIconWidth(), 10, 100, 25);
        jLabel1.setText("Lanzamientos");
        jLabel2.setBounds(160 + 2 * imagen.getIconWidth(), 10, 100, 25);
        jLabel2.setText("Cenas");

        lblLanzamientos.setBounds(50 + 2 * imagen.getIconWidth(), 40, 100, 100);
        lblLanzamientos.setBackground(new Color(0, 0, 0));
        lblLanzamientos.setFont(new Font("Tahoma", 1, 72)); // NOI18N
        lblLanzamientos.setForeground(new Color(51, 255, 0));
        lblLanzamientos.setText("0");
        lblLanzamientos.setHorizontalAlignment(SwingConstants.RIGHT);
        lblLanzamientos.setOpaque(true);

        lblCenas.setBounds(160 + 2 * imagen.getIconWidth(), 40, 100, 100);
        lblCenas.setBackground(new Color(0, 0, 0));
        lblCenas.setFont(new Font("Tahoma", 1, 72)); // NOI18N
        lblCenas.setForeground(new Color(51, 255, 0));
        lblCenas.setText("0");
        lblCenas.setHorizontalAlignment(SwingConstants.RIGHT);
        lblCenas.setOpaque(true);

        btnIniciar.setBounds(10, 150, 100, 25);
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnIniciarClick(evt);
            }
        });

        btnLanzar.setBounds(120, 150, 100, 25);
        btnLanzar.setText("Lanzar");
        btnLanzar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnLanzarClick(evt);
            }
        });

        getContentPane().setLayout(null);
        getContentPane().add(lblDado1);
        getContentPane().add(lblDado2);
        getContentPane().add(jLabel1);
        getContentPane().add(lblLanzamientos);
        getContentPane().add(jLabel2);
        getContentPane().add(lblCenas);

        getContentPane().add(btnIniciar);
        getContentPane().add(btnLanzar);

        dado1 = new Dado();
        dado2 = new Dado();

    }

    private void btnIniciarClick(ActionEvent evt) {

    }

    private void btnLanzarClick(ActionEvent evt) {
        dado1.lanzar(r);
        dado1.mostrar(lblDado1);
        dado2.lanzar(r);
        dado2.mostrar(lblDado2);
    }

}
