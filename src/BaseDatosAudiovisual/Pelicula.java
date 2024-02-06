package BaseDatosAudiovisual;

import java.util.ArrayList;

public class Pelicula extends ObraAudiovisual{

    private int anioEstreno;
    private String director;
    private ArrayList<Persona>ActoresPrincipales;
    private ArrayList<GeneroPelicula>Generos;

    public Pelicula(String titulo, int duracion, int anioEstreno, String director, ArrayList<Persona> actoresPrincipales, ArrayList<GeneroPelicula> generos) throws IllegalArgumentException {
        super(titulo, duracion);
        this.anioEstreno = anioEstreno;
        this.director = director;
        this.ActoresPrincipales = new ArrayList<>();
        this.Generos = new ArrayList<>();
    }

    private String convertirDuracion() {
        int horas = getDuracion() / 3600;
        int minutos = (getDuracion() % 3600) / 60;
        return String.format("%02d:%02d", horas, minutos);
    }
    @Override
    public String toString() {
        return "Pelicula{" + " duración " + convertirDuracion() +
                "año de estreno=" + anioEstreno +
                ", director='" + director + '\'' +
                ", Actores principales=" + ActoresPrincipales +
                ", Generos=" + Generos +
                "} " ;
    }

    @Override
    public int asignarPuntuacion(int numero) throws IllegalArgumentException {
        return super.asignarPuntuacion(numero);
    }

    @Override
    public double obtenerValoracion() {

        return 0;
    }
}
