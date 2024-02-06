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

    @Override
    public double obtenerValoracion() {
        if(obras.isEmpty()){
            return 0;
        }
        double media = 0;
        for (ObraAudiovisual obra : obras) {
            media += obra.obtenerValoracion();
        }
        return media / obras.size();
    }
}
