/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;
import practicaexamen.FigurasGeometricasPadre;
/**
 *TrianguloEquilatero
 * Hereda a la clase FigurasGeometricasPadre.
 * @author Andrés Matta
 */
public class TrianguloEquilatero extends FigurasGeometricasPadre{

    /**
     *Contructor heredado de FigurasGeometricasPadre.
     * @param lado1
     * @param lado2
     */
    public TrianguloEquilatero(int lado1, int lado2) {
        super(lado1, lado2);
    }

    /**
     *Area
     * @return el area del triangulo equilatero.
     */
    public float Area(){
        return(lado1*lado2/2);
    }

    /**
     *Perimetro
     * @return el perimetro del triangulo equilatero.
     */
    public float Perimetro(){
        return(lado1*3);
}
     //Permite imprimir los resultados de los métodos Area() y Perimetro().
    @Override
    public String toString() {
        return "El área del triangulo es: " + this.Area() + " y el perímetro del triangulo es: " + this.Perimetro();
    }
    
}
