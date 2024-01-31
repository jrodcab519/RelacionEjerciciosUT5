package Figuras;

public class Rombo extends ParalelogramoTodosLados{
    public Rombo(String nombre, double lado) {
        super(nombre, lado);
    }

    @Override
    public void dibujar() {
        System.out.println("◇");
    }
}
