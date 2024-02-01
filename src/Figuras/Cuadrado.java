package Figuras;

public class Cuadrado extends ParalelogramoTodosLados {
    public Cuadrado(String nombre, double lado) {
        super(nombre, lado);
    }

    @Override
    public void dibujar() {
        System.out.println("◻");
    }

    @Override
    public String toString() {
        return  super.toString() + " - Cuadrado de lado " + getLado();
    }
}
