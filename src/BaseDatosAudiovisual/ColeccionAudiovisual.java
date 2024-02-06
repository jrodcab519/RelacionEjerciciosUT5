package BaseDatosAudiovisual;

import java.util.ArrayList;
import java.util.List;

public abstract class ColeccionAudiovisual implements TieneValoracion {
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
        double media = 0;
        for (ObraAudiovisual obra : obras) {
            media += obra.obtenerValoracion();
        }
        return media / obras.size();
    }

    public ObraAudiovisual mejorValorada(){
        ObraAudiovisual mej = null;
        for(ObraAudiovisual o : obras){
            if(mej == null){
              mej = o;
            }else{
                if(mej.obtenerValoracion() < o.obtenerValoracion()){
                    mej = o;
                }
            }
        }return mej;
    }
    public ObraAudiovisual peorValorada(){
        ObraAudiovisual pe = null;
        for(ObraAudiovisual o : obras){
            if(pe == null){
                pe = o;
            }else{
                if(pe.obtenerValoracion() > o.obtenerValoracion()){
                    pe = o;
                }
            }
        }return pe;
    }

    public List<ObraAudiovisual> obrasDuracionMaxima(int duracion){
        List<ObraAudiovisual> max = new ArrayList<>();
        for(ObraAudiovisual o : obras){
            if(o.getDuracion() <= duracion){
            max.add(o);
            }
        }return max;
    }
}
