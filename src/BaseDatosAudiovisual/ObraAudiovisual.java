package BaseDatosAudiovisual;

import java.util.Objects;

public class ObraAudiovisual implements Puntuable, TieneValoracion{
    private String titulo;
    private int duracion;

    public ObraAudiovisual(String titulo, int duracion) throws IllegalArgumentException{
        setTitulo(titulo);
        setDuracion(duracion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws IllegalArgumentException {
        if(titulo.isEmpty()){
            throw new IllegalArgumentException("El título debe estar relleno");
        }else{
        this.titulo = titulo;}
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) throws IllegalArgumentException {
        if(duracion > 0){
        this.duracion = duracion;
        }else{
            throw new IllegalArgumentException("La duración no puede ser 0 segundos");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObraAudiovisual that = (ObraAudiovisual) o;
        return Objects.equals(titulo, that.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
