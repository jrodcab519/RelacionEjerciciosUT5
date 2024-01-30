package Reloj;

public class RelojPrincipal {
    public static void main(String[] args) {
        RelojBinario r = new RelojBinario(23,59,58);

        System.out.println(r);
        r.incrementaSegundos();
        System.out.println(r);
        r.incrementaSegundos();
        System.out.println(r);
        r.incrementaSegundos();
        System.out.println(r);

        r.incrementaSegundos(15000);
        System.out.println(r);

        RelojBinario r1 = new RelojBinario(21,59,58);
        System.out.println(r1);
        r1.incrementaSegundos(88888);
        System.out.println(r1);

        RelojCalendario r2 = new RelojCalendario(23,59,59, 28, 2, 1980);
        System.out.println(r2);
        r2.incrementaSegundos();
        System.out.println(r2);
        r2.incrementaSegundos(3);
        System.out.println(r2);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r2.diferenciaSegundos(r1));

        r1.dibujar();
        r2.dibujar();

        RelojHexadecimal r3 = new RelojHexadecimal(22,45,23);
        r3.incrementaSegundos(3);
        System.out.println(r3);
        r3.dibujar();
    }
}
