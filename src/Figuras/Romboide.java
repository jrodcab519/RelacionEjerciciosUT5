package Figuras;

public class Romboide extends ParalelogramoDosLados{

    public Romboide(String nombre, double base, double altura) {
        super(nombre, base, altura);
    }

    @Override
    public void dibujar() {
        System.out.println("▱");
    }

    @Override
    public String toString() {
        return super.toString() + " - Romboide de base " + getBase() + " y altura " + getAltura();
    }
}
