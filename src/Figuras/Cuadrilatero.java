package Figuras;
public abstract class Cuadrilatero extends FiguraGeometrica{
    private double [] lados;

    public Cuadrilatero(String nombre, double lado1, double lado2, double lado3, double lado4 ) {
        super(nombre);
        lados = new double[4];
        lados[0] = lado1;
        lados[1] = lado2;
        lados[2] = lado3;
        lados[3] = lado4;
    }
    @Override
    public double getPerimetro() {
        double suma = 0;
        for (double lado : lados){
            suma += lado;
        }
        return suma;
    }
    @Override
    public final String getTipoPrincipal() {
        return "Cuadrilátero";
    }

    @Override
    public String toString() {
      String resultado = super.toString() + " - Cuadrilátero de lados ";
      for (int i = 0; i < lados.length; i ++){
          if (i != 0) resultado += ", ";
          resultado += lados[i];
      }
      return resultado;
    }
}
