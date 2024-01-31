package Figuras;

public class Circulo extends FiguraGeometrica{

    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        System.out.println(" ○ ");
    }

    @Override
    public double getPerimetro() {
        return 2 * Math.PI * radio ;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String getTipoPrincipal() {
        return "Círculo";
    }

    @Override
    public String toString() {
        return super.toString() + " - Círculo de radio " + radio;
    }

}
