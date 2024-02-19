import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {

    private int numero;

    public int getNumero() {
        return numero;
    }

    public void lanzar(Random r) {
        numero = r.nextInt(6) + 1;
    }

    public void mostrar(JLabel lbl) {
        // obtener el nombre del archivo de la carta
        String nombreArchivo = "/imagenes/" + String.valueOf(numero) + ".jpg";
        // cargar la imagen
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreArchivo));
        // asignar la imagen al JLabel
        lbl.setIcon(imagen);

    }
}
