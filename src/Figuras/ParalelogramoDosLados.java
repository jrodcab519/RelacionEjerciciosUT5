package Figuras;

public abstract class ParalelogramoDosLados extends Paralelogramo{
    private final double base;
    private final double altura;

    public ParalelogramoDosLados(String nombre, double base, double altura) {
        super(nombre, base, altura);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
