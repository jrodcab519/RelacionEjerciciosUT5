package Reloj;

public class RelojBinario extends Reloj {


    public RelojBinario() {
    }

    public RelojBinario(int horas) throws IllegalArgumentException {
        super(horas);
    }

    public RelojBinario(int horas, int minutos) throws IllegalArgumentException {
        super(horas, minutos);
    }

    public RelojBinario(int horas, int minutos, int segundos) throws IllegalArgumentException {
        super(horas, minutos, segundos);
    }





    @Override
    public String toString() {

        String horasBinario = Integer.toBinaryString(getHoras());
        String minutosBinario = Integer.toBinaryString(getMinutos());
        String segundosBinario = Integer.toBinaryString(getSegundos());

        String cadena = "0".repeat(6 - horasBinario.length()) + horasBinario + ":"
                        + "0".repeat(6 - minutosBinario.length()) + minutosBinario + ":"
                         +"0".repeat(6 - segundosBinario.length()) + segundosBinario;
        return cadena;
    }

    @Override
    public void dibujar() {
        System.out.printf("|%02d%s|%02d%s|%02d%s|\n",
                getHoras(),
                Character.toString(0x2800 + getHoras()),
                getMinutos(),
                Character.toString(0x2800 + getMinutos()),
                getSegundos(),
                Character.toString(0x2800 + getSegundos())
        );
    }
}
