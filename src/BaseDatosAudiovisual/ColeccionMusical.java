package BaseDatosAudiovisual;

public class ColeccionMusical extends ColeccionAudiovisual {

    public ColeccionMusical(String descripcion) throws IllegalArgumentException {
        super(descripcion);
    }

    @Override
    public void anadirobra(ObraAudiovisual obra) throws IllegalArgumentException {
        if(obra instanceof Disco) {
            super.anadirobra(obra);
        }else throw new IllegalArgumentException("Sólo se pueden añadir obras del tipo Disco");
    }

}
