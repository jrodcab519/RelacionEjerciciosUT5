package Figuras;

public abstract class FiguraGeometrica implements Dibujable {

private String nombre;

    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public abstract double getPerimetro();

    public abstract double getArea();

    public abstract String getTipoPrincipal();


    @Override
    public String toString() {
        return "Figura";
    }
}
