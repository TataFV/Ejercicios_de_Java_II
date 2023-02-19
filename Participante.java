//Crea una clase llamada "Participante"
public class Participante {
    //Añade atributos
    private int victorias;
    private int derrotas;
    private int partidas;
    private String nombre;

    //Agrega constructor vacío
    public Participante() {
    }

    //Constructor parametrizado
    public Participante(int victorias, int derrotas, int partidas, String nombre){
        this.victorias = victorias;
        this.derrotas = derrotas;
        this.partidas = partidas;
        this.nombre = nombre;
    }

//Agrega los setter y getter
    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getPartidas() {
        return partidas;
    }

    public void setPartidas(int partidas) {
        this.partidas = partidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Añade una función que devuelva una cada de caracteres que contenga la info del nombre, victorias y derrotas
    public String info(){
        return("Nombre:" + nombre + ", Victorias: "+ victorias + ", Derrrotas: " + derrotas );
    }
}

// Agrega una clase Usuario que herede de Participante.
// Añade una función que reciba una cadena de caracteres
