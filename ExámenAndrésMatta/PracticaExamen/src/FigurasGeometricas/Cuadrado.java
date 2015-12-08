/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;
//Importo el paquete practicaexamen.
import practicaexamen.FigurasGeometricasPadre;
/**
 *Cuadrado
 * hereda a FigurasGeometricasPadre
 * @author Andrés Matta
 */
public class Cuadrado extends FigurasGeometricasPadre{

    /**
     *Constructor heredado de la clase madre.
     * @param lado1
     * @param lado2
     */
    public Cuadrado(int lado1, int lado2) {
        super(lado1, lado2);
    }
    
    /**
     *Area
     * @return area del cuadrado
     */
    public float Area(){
        return(lado1*lado1);
    }

    /**
     *Perimetro
     * @return
     */
    public float Perimetro(){
        return(lado1*4);
}
    //Permite imprimir los resultados de los métodos Area() y Perimetro().
    @Override
    public String toString() {
        return "El área del cuadrado es: " + this.Area() + " y el perímetro del cuadrado es: " + this.Perimetro();
    }
}