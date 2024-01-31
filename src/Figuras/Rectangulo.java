package Figuras;

public class Rectangulo extends ParalelogramoDosLados {
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre, base, altura);
    }

    @Override
    public void dibujar() {
        System.out.println("▭");
    }

    @Override
    public String toString() {
        return super.toString() + " - Rectángulo de base " + getBase() + " y altura " + getAltura();
    }
}
