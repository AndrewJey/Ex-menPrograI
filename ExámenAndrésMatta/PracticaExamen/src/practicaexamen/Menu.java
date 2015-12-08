/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaexamen;

import practicaexamen.FigurasGeometricasPadre;
//Importo las clases del paquete FigurasGeometricas.
import FigurasGeometricas.Cuadrado;
import FigurasGeometricas.Rectangulo;
import FigurasGeometricas.TrianguloEquilatero;
//Importo JOptionPane.
import javax.swing.JOptionPane;

/**
 * Clase Menu. Clase encargada de ejecutar el programa.
 *
 * @author Andrés Matta
 */
public class Menu {

    //Variable char, encargada de recibir un Input.
    char i;

    /**
     * Contructor con la variable char
     * @param i
     */
    public Menu(char i) {
        this.i = i;
    }

    /**
     * Constructor Vacio
     */
    public Menu() {
    }

    /**
     * get del char i
     *
     * @return i
     */
    public char getI() {
        return i;
    }

    /**
     * Set del char i
     *
     * @param i
     */
    public void setI(char i) {
        this.i = i;
    }

    /**
     * Método menuFiguras Encargado de ejecutar el programa. Contiene instancias
     * de todas las clases.
     */
    public void menuFiguras() {
        //Variables lado1 y lado2 de la clase FigurasGeometricasPadre.
        int lado1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de largo o altura", "altura", JOptionPane.WARNING_MESSAGE));
        int lado2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el valor de ancho o base", "altura", JOptionPane.WARNING_MESSAGE));
        //Intancia de la clase FigurasGeometricasPadre.
        FigurasGeometricasPadre fgp = new FigurasGeometricasPadre(lado1, lado2);
        //Switch para la variable i. Cada case representa una figura.
        switch (i) {
            //Cuadrado.
            case 'a':
                //Instancia de la clase Cuadrado.
                FigurasGeometricas.Cuadrado c1 = new Cuadrado(lado1, lado2);
                //Llamo al método Area() de la clase Cuadrado.
                c1.Area();
                //Llamo al método Perimetro() de la clase Cuadrado.
                c1.Perimetro();
                 //Muestro resultados por medio del ToString() de la clase.
                JOptionPane.showMessageDialog(null, c1.toString(), "Cuadrado", JOptionPane.ERROR_MESSAGE);
                break;
            //Rectangulo.
            case 'b':
                //Instancia de la clase Rectangulo.
                FigurasGeometricas.Rectangulo r1 = new Rectangulo(lado1, lado2);
                //Llamo al método Area() de la clase Rectangulo.
                r1.Area();
                //Llamo al método Perimetro() de la clase Rectangulo.
                r1.Perimetro();
                //Muestro resultados por medio del ToString() de la clase.
                JOptionPane.showMessageDialog(null, r1.toString(), "Rectangulo", JOptionPane.ERROR_MESSAGE);
                break;
            //Triangulo.
            case 'c':
                //Instancia de la clase TrianguloEquilatero.
                FigurasGeometricas.TrianguloEquilatero t1 = new TrianguloEquilatero(lado1, lado2);
                //Llamo al método Area() de la clase TrianguloEquilatero.
                t1.Area();
                //Llamo al método Perimetro() de la clase TrianguloEquilatero.
                t1.Perimetro();
                //Muestro resultados por medio del ToString() de la clase.
                JOptionPane.showMessageDialog(null, t1.toString(), "Triangulo", JOptionPane.ERROR_MESSAGE);
                break;
            //En caso de digitar un caracter distinto a los mostrados.
            default:
                JOptionPane.showMessageDialog(null, "Error, categoria incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
