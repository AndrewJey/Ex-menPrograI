/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenarbayfernandez;
//Importo la clase FigurasGeometricasPadre del paquete examenarbayfernandez.
import examenarbayfernandez.FigurasGeometricasPadre;
import javax.swing.JOptionPane;

/**
*@author Arbay Fernández Solano.
**/
public class Menu {
    /**
    *Variables de tipo entero llamadas lado1, lado2. 
    **/
    private int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrase el lado1"));
    private int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrase el lado2"));
    /**
    *Instancio mis clases. 
    **/
    FigurasGeometricas.Cuadrado c1 = new FigurasGeometricas.Cuadrado(lado1, lado2);
    FigurasGeometricas.Rectangulo r1 = new FigurasGeometricas.Rectangulo(lado1, lado2);
    FigurasGeometricas.TrianguloEquilatero t1 = new FigurasGeometricas.TrianguloEquilatero(lado1, lado2);
    //Variable de tipo chat llamada select.
    char select = JOptionPane.showInputDialog("Ingrese \n c = Cuadrado \n r = Rectangulo \n t = Triángulo").charAt(0);
    /**
    *Método Constructor de mi clase Manu.
    *@param select 
    **/
    public Menu(char select) {
        this.select = select;
    }
    /**
    *Método Constructor vacio. 
    **/
    public Menu() {
    }
    /**
    *Método de tipo void llamado menuFigurasGeometricas.
    *Menú para seleccionar las diferentes figuras.
    **/
    public void menuFigurasGeometricas() {
        switch (select) {
            case 'c':
                JOptionPane.showMessageDialog(null, c1.toString(), "FIGURAS ", JOptionPane.WARNING_MESSAGE);
                break;
            case 'r':
                JOptionPane.showMessageDialog(null, r1.toString(), "FIGURAS ", JOptionPane.WARNING_MESSAGE);
                break;
            case 't':
                JOptionPane.showMessageDialog(null, t1.toString(), "FIGURAS ", JOptionPane.WARNING_MESSAGE);
                break;
            default:
                break;
        }
    }
}
