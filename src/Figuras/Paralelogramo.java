package Figuras;

public abstract class Paralelogramo extends Cuadrilatero{

    private double lado1;

    private double lado2;

    public Paralelogramo(String nombre, double lado1, double lado2) {
        super(nombre, lado1, lado2, lado1, lado2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    @Override
    public double getArea() {
        return lado1 * lado2;
    }

    @Override
    public String toString() {
        return super.toString() + " - Paralelogramo";
    }
}
