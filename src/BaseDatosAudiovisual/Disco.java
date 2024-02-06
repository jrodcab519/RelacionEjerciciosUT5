package BaseDatosAudiovisual;

public class Disco extends ObraAudiovisual{
    private String artistaPrincipal;
    private int numeroPistas;
    private int anioPublicacion;


    public Disco(String titulo, int duracion, String artistaPrincipal, int numeroPistas, int anioPublicacion) throws IllegalArgumentException{
        super(titulo, duracion);
        setArtistaPrincipal(artistaPrincipal);
        setNumeroPistas(numeroPistas);
        setAnioPublicacion(anioPublicacion);
    }

    public String getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public void setArtistaPrincipal(String artistaPrincipal) throws IllegalArgumentException{
        if (artistaPrincipal.isEmpty()){
            throw new IllegalArgumentException("El nombre del artista principal debe estar relleno");
        }else {
            this.artistaPrincipal = artistaPrincipal;
        }
    }

    public int getNumeroPistas() {
        return numeroPistas;
    }

    public void setNumeroPistas(int numeroPistas) throws IllegalArgumentException{
        if (numeroPistas <= 0){
            throw new IllegalArgumentException("El numero de pistas no puede ser 0 ni negativo");
        }else {
            this.numeroPistas = numeroPistas;
        }
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) throws IllegalArgumentException{
        if (anioPublicacion <= 0){
            throw new IllegalArgumentException("El año de publicaciónno puede ser negativo");
        }else {
            this.anioPublicacion = anioPublicacion;
        }
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
