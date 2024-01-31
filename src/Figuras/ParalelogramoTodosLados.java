package Figuras;

public abstract class ParalelogramoTodosLados extends Paralelogramo{

    private final double lado;
    public ParalelogramoTodosLados(String nombre, double lado) {
        super(nombre, lado);
        this.lado = lado;
    }
}
