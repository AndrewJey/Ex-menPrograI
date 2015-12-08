/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;
//Importo al paquete practicaexamen.
import practicaexamen.FigurasGeometricasPadre;
/**
 *Rectangulo
 * hereda a la clase FigurasGeometricasPadre.
 * @author Andrés Matta
 */
public class Rectangulo extends FigurasGeometricasPadre{

    /**
     *Contructor heredado de FigurasGeomtricasPadre.
     * @param lado1
     * @param lado2
     */
    public Rectangulo(int lado1, int lado2) {
        super(lado1, lado2);
    }

    /**
     *Area
     * @return el area del rectangulo.
     */
    public float Area(){
        return(lado1*lado2);
    }

    /**
     *Perimetro
     * @return el perimetro del rectangulo.
     */
    public float Perimetro(){
        return(lado1*2+lado2*2);
}
    //Permite imprimir los resultados de los métodos Area() y Perimetro().
    @Override
    public String toString() {
        return "El área del rectángulo es: " + this.Area() + " y el perímetro del rectángulo es: " + this.Perimetro();
    }
    
}
