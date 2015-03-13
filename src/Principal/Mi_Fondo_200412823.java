/**
 * Universidad de San Carlos de Guatemala
 * Facultad de Ingenieria
 * Ingenieria en Ciencias y Sistemas
 * Esdras Benjamin Cotto Revolorio
 * Carnet: 200412823
 */

package Principal;

/**
 * importacion paquetes
 */
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * Esta clase sirve para poder colocar 
 */
public class Mi_Fondo_200412823 extends JPanel 
{
    /**
     * Declaracion de atributos
     */
    private Image imagen;

    /**
     * Constructor de la clase, para nuevo panel
     */
    public Mi_Fondo_200412823() 
    {
    }

    /**
     * Constructor de la clase sobrecargado, para nuevo panel
     */ 
    public Mi_Fondo_200412823(String nombreImagen) 
    {
        if (nombreImagen != null) 
        {
            imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
        }
    }

    /**
     * Constructor de la clase sobrecargado, para nuevo panel
     */ 
    public Mi_Fondo_200412823(Image imagenInicial) 
    {
        if (imagenInicial != null) 
        {
            imagen = imagenInicial;
        }
    }

    /**
     * Metodo para setear una imagen de fondo en el panel
     */
    public void setImagen(String nombreImagen) 
    {
        if (nombreImagen != null) 
        {
            imagen = new ImageIcon(getClass().getResource(nombreImagen)).getImage();
        } 
        else 
        {
            imagen = null;
        }

        repaint();
    }

    /**
     * Metodo para setear una imagen de fondo en el panel
     */
    public void setImagen(Image nuevaImagen) 
    {
        imagen = nuevaImagen;
        repaint();
    }

    /**
     * Sobrecarga del metodo paint, para pintar el background del panel
     */
    @Override
    public void paint(Graphics g) 
    {
        if (imagen != null) 
        {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);
        } 
        else 
        {
            setOpaque(true);
        }

        super.paint(g);
    }

}
