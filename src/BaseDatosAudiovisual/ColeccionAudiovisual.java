package BaseDatosAudiovisual;

import java.util.ArrayList;
import java.util.List;

public class ColeccionAudiovisual implements TieneValoracion {
    private String descripcion;
    ArrayList<ObraAudiovisual>obras;

    public ColeccionAudiovisual(String descripcion) throws IllegalArgumentException{
        this.obras = new ArrayList<>();
        setDescripcion(descripcion);
    }

    public void anadirobra(ObraAudiovisual obra) throws IllegalArgumentException{
        if(!obras.contains(obra)){
            obras.add(obra);
        }else{
            throw new IllegalArgumentException("La obra ya existe");
        }
    }

    public void eliminarobra(ObraAudiovisual obra){
        obras.remove(obra);
    }

    public void anadirObras(){

    }
    public void eliminarObras(){

    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) throws IllegalArgumentException {
        if (descripcion.isEmpty()){
            throw new IllegalArgumentException("La descripción no puede estar vacía");
        }else {
            this.descripcion = descripcion;
        }
    }

    public List<ObraAudiovisual> getObras() {

        return List.copyOf(obras);
    }
}
