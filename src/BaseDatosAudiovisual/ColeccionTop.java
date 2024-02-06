package BaseDatosAudiovisual;

public class ColeccionTop extends ColeccionAudiovisual {

    public ColeccionTop(String descripcion) throws IllegalArgumentException {
        super(descripcion);
    }

    @Override
    public void anadirobra(ObraAudiovisual obra) throws IllegalArgumentException {
        if(obtenerValoracion() >= 4) {
            super.anadirobra(obra);
        }else throw new IllegalArgumentException("La obra tiene que tener un mínimo de 4 para ser añadida");

    }
}
