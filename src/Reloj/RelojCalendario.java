package Reloj;

public class RelojCalendario extends Reloj{
    private int dias;
    private int mes;
    private int anyo;

    public RelojCalendario(int horas, int minutos, int segundos, int dias, int mes, int anyo) throws IllegalArgumentException {
        super(horas, minutos, segundos);
        setAnyo(anyo);
        setMes(mes);
        setDia(dias);
    }

    public int getDia() {
        return dias;
    }

    public int getMes() {
        return mes;
    }

    public int getAnyo() {
        return anyo;
    }

    private void setMes(int mes) throws IllegalArgumentException {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("El mes debe ser un número entre 1 y 12");
        }
    }

    private void setDia(int dias) throws IllegalArgumentException {
        boolean bisiesto = anyo % 4 == 0 && (anyo % 100 != 0) || (anyo % 400 == 0);
        switch (this.mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dias >= 1 && dias <= 31) {
                    this.dias = dias;
                } else
                    throw new IllegalArgumentException("El día debe ser un número entre 1 y 31");
                break;
            case 2:
                if (bisiesto) {
                    if (dias >= 1 && dias <= 29) {
                        this.dias = dias;
                    } else {
                        throw new IllegalArgumentException("El día debe ser un número entre 1 y 29");
                    }
                } else {
                    if (dias >= 1 && dias <= 28) {
                        this.dias = dias;
                    } else {
                        throw new IllegalArgumentException("El día debe ser un número entre 1 y 28");
                    }
                }
                break;
            case 4, 6, 9, 11:
                if (dias >= 1 && dias <= 30) {
                    this.dias = dias;
                } else
                    throw new IllegalArgumentException("El día debe ser un número entre 1 y 28");
                break;
        }
    }

    private void setAnyo(int anyo) throws IllegalArgumentException {
        if (anyo >= 1) {
            this.anyo = anyo;
        } else {
            throw new IllegalArgumentException("El anyo debe ser un número mayor de 1");
        }
    }

    @Override
    public String toString() {
        String cadena = "Hora: " + String.format("%02d:%02d:%02d", getHoras(), getMinutos(), getSegundos()) + ", Fecha: " + dias + "/" + mes + "/" + anyo;
        return cadena;
    }

    @Override
    public void incrementaSegundos() {
        super.incrementaSegundos(1);
    }

    @Override
    public void incrementaSegundos(int numSeg) {
        boolean bisiesto = anyo % 4 == 0 && (anyo % 100 != 0) || (anyo % 400 == 0);

        int segundos = getSegundos() + numSeg;
        int minutos = getMinutos() + segundos / 60;
        int horas = getHoras() + minutos / 60;
        int incrementoDias = horas / 24;

        super.incrementaSegundos(numSeg);

        dias += incrementoDias;

        do {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                incrementoDias -= 31;
                if(dias > 31){
                dias = 1;
                mes += 1;}
            }
            if (mes == 2) {
                if (bisiesto) {
                    incrementoDias -= 29;
                    if(dias > 29){
                    dias = 1;
                    mes += 1;}
                } else {
                    incrementoDias -= 28;
                    if(dias > 28){
                    dias = 1;
                    mes += 1;}
                }
            }
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                incrementoDias -= 30;
                if(dias > 30){
                dias = 1;
                mes += 1;}
            }
            if (mes == 13) {
                mes = 1;
                anyo += 1;
            }
        }while(incrementoDias > 0);
    }

    @Override
    public void dibujar() {
        String fecha = getDia() +
                " del " + getMes() + " de " +
                getAnyo();

        int rellenoIzda = (fecha.length() - 8) / 2;
        System.out.println("╭─" + "─".repeat(fecha.length()) + "─╮");
        System.out.println("│ " + fecha + " |");
        System.out.println("│ " + " ".repeat(rellenoIzda) + super.toString() +
                " ".repeat(fecha.length() - rellenoIzda - 8) + " |");
        System.out.println("└─" + "─".repeat(fecha.length()) + "─┘" );
    }
}

