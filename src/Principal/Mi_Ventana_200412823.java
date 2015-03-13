/**
 * Universidad de San Carlos de Guatemala
 * Facultad de Ingenieria
 * Ingenieria en Ciencias y Sistemas
 * Esdras Benjamin Cotto Revolorio
 * Carnet: 200412823
 */

package Principal;

/**
 * Importacion de paquetes
 */
import java.awt.Image;
import javax.swing.JFrame;

/**
 * Clase para crear una ventana personalizada, que cargara un panel con un fondo
 */
public class Mi_Ventana_200412823 extends JFrame 
{

    /**
     * Instanciando un Jpanel personalizado
     */
    private final Mi_Fondo_200412823 contenedor = new Mi_Fondo_200412823();

    /**
     * Constructor de la clase
     */
    public Mi_Ventana_200412823() {
        setContentPane(contenedor);
        setImagen("/Images/Fondo2.jpg");
       // panelEditor.setVisible(true);
    }

    /**
     * Metodo para setear una imagen en el contenedor
     */
    public void setImagen(String nombreImagen) {
        contenedor.setImagen(nombreImagen);
    }

    /**
     * Metodo para setear una imagen en el contenedor
     */
    public void setImagen(Image nuevaImagen) {
        contenedor.setImagen(nuevaImagen);
    }

}
