/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaexamen;
//Importo todas las clases como el enunciado lo indica(no sé para qué jaja).
import FigurasGeometricas.Cuadrado;
import FigurasGeometricas.Rectangulo;
import FigurasGeometricas.TrianguloEquilatero;
//Importo JOptionPane.
import javax.swing.JOptionPane;

/**
 *clase PracticaExamen().
 * @author Andrés Matta
 */
public class PracticaExamen {

    /**
     * Clase main del paquete "practicaexamen".
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Variable char de la clase menu(), elige la figura deseada.
    char i= JOptionPane.showInputDialog("Eligir la figura deseada: a.Cuadrado b.Rectangunlo c.Triangulo Equilatero").charAt(0);
    //Intancia del constructor lleno con la variable i.
    Menu m1 = new Menu(i);   
   //Intancia del contructor vacio.
    Menu m2 = new Menu();
    //Llamada al método menuFiguras() de la clase menu().
    m1.menuFiguras();
    }
    
}
