package Figuras;

public abstract class ParalelogramoTodosLados extends Paralelogramo{

    private final double lado;
    public ParalelogramoTodosLados(String nombre, double lado) {
        super(nombre, lado, lado);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
}
