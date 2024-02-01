package Figuras;

public class FiguraPrincipal {
    public static void main(String[] args) {

        System.out.println("-------------------------------------------------------------------------------------------");

        FiguraGeometrica f1 = new Circulo("Circulo1", 3);

        System.out.println(f1);
        System.out.println("Perimetro " + f1.getPerimetro());
        System.out.println("Area " + f1.getArea());
        System.out.println("Tipo " + f1.getTipoPrincipal());
        f1.dibujar();

        System.out.println("-------------------------------------------------------------------------------------------");

        FiguraGeometrica f2 = new TrianguloRectangulo("Triángulo 1", 3, 5);

        System.out.println(f2);
        System.out.println("Perimetro " + f2.getPerimetro());
        System.out.println("Area " + f2.getArea());
        System.out.println("Tipo " + f2.getTipoPrincipal());
        f2.dibujar();

        System.out.println("-------------------------------------------------------------------------------------------");

        FiguraGeometrica f3 = new Rectangulo("Rectángulo 1",3,5);

        System.out.println(f3);
        System.out.println("Perimetro " + f3.getPerimetro());
        System.out.println("Area " + f3.getArea());
        System.out.println("Tipo " + f3.getTipoPrincipal());
        f3.dibujar();

        System.out.println("-------------------------------------------------------------------------------------------");

        FiguraGeometrica f4 = new Romboide("Romboide 1",7,3);

        System.out.println(f4);
        System.out.println("Perimetro " + f4.getPerimetro());
        System.out.println("Area " + f4.getArea());
        System.out.println("Tipo " + f4.getTipoPrincipal());
        f4.dibujar();

        System.out.println("-------------------------------------------------------------------------------------------");

        FiguraGeometrica f5 = new Cuadrado("Cuadrado 1",7);

        System.out.println(f5);
        System.out.println("Perimetro " + f5.getPerimetro());
        System.out.println("Area " + f5.getArea());
        System.out.println("Tipo " + f5.getTipoPrincipal());
        f5.dibujar();

        System.out.println("-------------------------------------------------------------------------------------------");


        FiguraGeometrica f6 = new Trapecio("Trapecio 1",7,3,5);

        System.out.println(f6);
        System.out.println("Perimetro " + f6.getPerimetro());
        System.out.println("Area " + f6.getArea());
        System.out.println("Tipo " + f6.getTipoPrincipal());
        f6.dibujar();

        System.out.println("-------------------------------------------------------------------------------------------");


        FiguraGeometrica f7 = new Rombo("Rombo 1",7);

        System.out.println(f7);
        System.out.println("Perimetro " + f7.getPerimetro());
        System.out.println("Area " + f7.getArea());
        System.out.println("Tipo " + f7.getTipoPrincipal());
        f7.dibujar();

        System.out.println("-------------------------------------------------------------------------------------------");

    }
}
