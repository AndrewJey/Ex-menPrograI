/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenarbayfernandez;
/**
 *@author Arbay Fernández Solano.
 **/
public class FigurasGeometricasPadre extends Object {
    /**
     *Declaro mis varibles de tipo intero llamdas lado1,lado2. 
     **/
    public int lado1;
    public int lado2;
    /**
     * Método Constructor de mi clase FigurasGeometricasPadre.
     * @param lado1.
     * @param lado2.
     */
    public FigurasGeometricasPadre(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    /**
    *Método getLado1 
    *@return lado1. 
    **/
    public int getLado1() {
        return lado1;
    }
    /**
    *Método setlado1. 
    *@param lado1 
    **/
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }
    /**
    *Método getlado2. 
    *@return lado2.
    **/
    public int getLado2() {
        return lado2;
    }
    /**
    *Método setLado2. 
    *@param lado2. 
    **/
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    /**
    *Método toString.
    *@return String de impresiones.
    **/
    @Override
    public String toString() {
        return ("FigurasGeometricasPadre tiene un lado 1 de: " + this.lado1 + " y un lado2 de: " + this.lado2);
    }

}
