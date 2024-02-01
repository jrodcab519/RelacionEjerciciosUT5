package Figuras;

public class Trapecio extends Cuadrilatero{

    private final double baseMayor;
    private final double baseMenor;
    private final double altura;

    public Trapecio(String nombre, double baseMayor, double baseMenor, double altura) {

        super(nombre, baseMenor, baseMayor,Math.sqrt(altura * altura + (double) 1 / 4 * Math.pow(baseMayor - baseMenor, 2)) , Math.sqrt(altura * altura + (double) 3 / 4 * Math.pow(baseMayor - baseMenor, 2)));

        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }
    @Override
    public void dibujar() {
        System.out.println("▰");
    }

    @Override
    public double getArea() {
        return (baseMayor + baseMenor / 2) * altura;
    }

    @Override
    public String toString() {
        return super.toString() + " - Trapecio de base menor " + baseMenor + " , base mayor " + baseMayor + ", altura " + altura;
    }
}
