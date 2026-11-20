public class ExamOneCheck {
 public static void main(String[] args) throws Exception {

 CheckSupport.close(new FigurasGeometricas.Cuadrado(3,3).Area(),9);
 CheckSupport.close(new FigurasGeometricas.Rectangulo(3,5).Area(),15);
 CheckSupport.close(new FigurasGeometricas.Rectangulo(3,5).Perimetro(),16);
 CheckSupport.close(new FigurasGeometricas.TrianguloEquilatero(3,3).Area(),4.5);
 CheckSupport.close(new FigurasGeometricas.Rectangulo(50000,50000).Area(),2500000000d);

 CheckSupport.done();
 }
}
