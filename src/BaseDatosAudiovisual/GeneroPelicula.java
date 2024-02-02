package BaseDatosAudiovisual;

public class GeneroPelicula {
    private final String nombre;

    public GeneroPelicula(String nombre) throws IllegalArgumentException{
        if (nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre debe estar relleno");
        }else {
            this.nombre = nombre;
        }
    }

    public String getNombre() {
        return nombre;
    }
}
