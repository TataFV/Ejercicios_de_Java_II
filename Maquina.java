import java.util.Random;

// Crea una clase "Máquina". Haz que herede de "Participante"
public class Maquina extends Participante {

    //Añade una función que, al azar, escoja el valor 0 o 1 y lo devuelva
    public int azar() {
        Random generator = new Random();
        return generator.nextInt(2);
    }
}

