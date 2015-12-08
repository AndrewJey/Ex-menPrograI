/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaexamen;

/**
 *Clase FigurasGeometricasPadre
 * Clase que hereda las variables lado1 y lado2 a las clases del paquete FigurasGeometricas.
 * @author Andrés Matta
 */
public class FigurasGeometricasPadre {
   //Variables enteras lado1 y lado2.
    public int lado1;
    public int lado2;

    /**
     *Contructor funcional para lado1 y lado2.
     * @param lado1
     * @param lado2
     */
    public FigurasGeometricasPadre(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     *Método get() para lado1.
     * @return lado1
     */
    public int getLado1() {
        return lado1;
    }

    /**
     *Método set() para lado1.
     * @param lado1
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    /**
     *Método get() para lado2.
     * @return lado2
     */
    public int getLado2() {
        return lado2;
    }

    /**
     *Método set() para lado2.
     * @param lado2
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
  
    @Override
    public String toString() {
        return "FigurasGeometricasPadre{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
    
}
