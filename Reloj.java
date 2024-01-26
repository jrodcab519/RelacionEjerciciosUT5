package Reloj;

public class Reloj {

    private int horas;
    private int minutos;
    private int segundos;

    public Reloj() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Reloj(int horas) throws IllegalArgumentException {
        setHora(horas);
        this.minutos = 0;
        this.segundos = 0;
    }

    public Reloj(int horas, int minutos) throws IllegalArgumentException {
        setHora(horas);
        setMinutos(minutos);
        this.segundos = 0;
    }

    public Reloj(int horas, int minutos, int segundos) throws IllegalArgumentException {
        setHora(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }


    public void incrementaSegundos(){
        incrementaSegundos(1);
    }
    public void incrementaSegundos(int numSeg){

    segundos += numSeg;
    minutos += segundos / 60;
    segundos = segundos % 60;

    horas += minutos / 60;
    minutos = minutos % 60;

    horas = horas % 24;
    }

    private void setHora(int horas) throws IllegalArgumentException{
        if (horas >= 0 && horas <= 23){
            this.horas = horas;}
        else{
            throw new IllegalArgumentException("La hora debe ser un número entre 0 y 23");
        }
    }

    private void setMinutos(int minutos) throws  IllegalArgumentException{
        if (minutos >= 0 && minutos <= 59){
            this.minutos = minutos;}
        else{
            throw new IllegalArgumentException("Los minutos deben ser un número entre 0 y 59");
        }
    }

    private void setSegundos(int segundos) throws IllegalArgumentException{
        if (segundos >= 0 && segundos <= 59){
            this.segundos = segundos;}
        else{
            throw new IllegalArgumentException("Los segundos deben ser un número entre 0 y 59");
        }
    }

    @Override
    public String toString() {
        String cadena = String.format("%02d:%02d:%02d", horas, minutos, segundos);
        return cadena;
    }
}
