package BaseDatosAudiovisual;

public  interface Puntuable {
    default void asignarPuntuacion(int numero) {
        if(numero < 0 || numero > 5){
            throw new IllegalArgumentException("La puntuación tiene que ser un número del 0 aL 5");
        }
    }
}
