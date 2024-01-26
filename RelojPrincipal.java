package Reloj;

public class RelojPrincipal {
    public static void main(String[] args) {
        Reloj r = new Reloj(23,59,58);

        System.out.println(r);
        r.incrementaSegundos();
        System.out.println(r);
        r.incrementaSegundos();
        System.out.println(r);
        r.incrementaSegundos();
        System.out.println(r);

        r.incrementaSegundos(15000);
        System.out.println(r);

        RelojBinario r1 = new RelojBinario(23,59,58);
        System.out.println(r1);
        r1.incrementaSegundos(1000);
        System.out.println(r1);

        RelojCalendario r2 = new RelojCalendario(23,59,58, 28, 2, 1981);
        System.out.println(r2);
        r2.incrementaSegundos();
        System.out.println(r2);
        r2.incrementaSegundos(3);
        System.out.println(r2);
    }
}
