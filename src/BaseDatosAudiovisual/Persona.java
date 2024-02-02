package BaseDatosAudiovisual;

public class Persona {
    private String nombre;
    private String apellidos;

    public Persona(String nombre, String apellidos) throws IllegalArgumentException{
        setNombre(nombre);
        setApellidos(apellidos);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws IllegalArgumentException{
        if(nombre.isEmpty()){
            throw new IllegalArgumentException("El nombre debe estar relleno");
        }else{
        this.nombre = nombre;
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) throws IllegalArgumentException{
        if(apellidos.isEmpty()){
            throw new IllegalArgumentException("Los apellidos deben estar rellenos");
        }else {
            this.apellidos = apellidos;
        }
    }
}
