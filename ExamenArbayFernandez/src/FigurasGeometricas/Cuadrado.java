/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FigurasGeometricas;
//Importo la clase FigurasGeometricasPadre del paquete examenarbayfernandez.
import examenarbayfernandez.FigurasGeometricasPadre;
/**
*Sea crea la clase Cuadrado que hereda de la clase FigurasGeometricasPadre del paquete examenarbayfernandez. 
*@author Arbay Fernández Solano.
**/
public class Cuadrado extends examenarbayfernandez.FigurasGeometricasPadre {
    /**
     *Metodo Constructor de mi clase Cuadrado.
     *@param lado1
     *@param lado2 
     **/
    public Cuadrado(int lado1, int lado2) {
        super(lado1, lado2);
    /**
    *Método de tipo float llamado Área.
    *@return (lado1 * lado2). 
    **/    
    }
    public float Area() {
        return lado1 * lado2;
    }
    /**
    *Método de tipo float llamado Área.
    *@return (lado1 ^ 4).
    **/  
    public float Perimetro() {
        return lado1 * 4;
    }
    /**
    *Método toString.  
    *@return String de impresiones.
    **/
    @Override
    public String toString() {
        return ("Cuadrado tiene un Área de: "+this.Area()+" y un Perimetro de "+this.Perimetro());
    }
}
