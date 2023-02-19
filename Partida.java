import java.util.Random;
import java.util.Scanner;

public class Partida {
    private Usuario usuario;
    private Maquina maquina;

    private int num_rondas;

    private int total_rondas;

    public Partida() {
    }

    public Partida(Usuario usuario, Maquina maquina, int num_rondas, int total_rondas) {
        this.usuario = usuario;
        this.maquina = maquina;
        this.num_rondas = num_rondas;
        this.total_rondas = total_rondas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Maquina getMaquina() {
        return maquina;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }

    public int getNum_rondas() {
        return num_rondas;
    }

    public void setNum_rondas(int num_rondas) {
        this.num_rondas = num_rondas;
    }

    public int getTotal_rondas() {
        return total_rondas;
    }

    public void setTotal_rondas(int total_rondas) {
        this.total_rondas = total_rondas;
    }

    public int azar() {
        Random generator = new Random();
        return generator.nextInt(2);
    }

    public void init_partida(String nombre, String maquina) {
        this.usuario = new Usuario();
        this.maquina = new Maquina();
        usuario.setNombre(nombre);
        this.maquina.setNombre(maquina);
        usuario.setVictorias(0);
        this.maquina.setVictorias(0);
    }

    public void jugar_partida() {
        num_rondas = 0;
        Scanner escaner = new Scanner(System.in);
        do {
            System.out.println("Introduce 'cara' o 'cruz'");
            String respuesta = escaner.nextLine();
            if (maquina.azar() == usuario.getCaraCruz(respuesta)) {
                System.out.println("Has acertado");
                usuario.setVictorias(usuario.getVictorias()+1);
            } else {
                System.out.println("Has fallado");
                maquina.setVictorias(maquina.getVictorias()+1);
            }

            num_rondas++;


        } while (num_rondas < total_rondas);

        System.out.println("---- RESULTADO ----");
        if(usuario.getVictorias() > maquina.getVictorias()){
            System.out.println("¡Enhorabuena! Has ganado");
        }else if(usuario.getVictorias() < maquina.getVictorias()){
            System.out.println("Lo siento. Has perdido, ganó la máquina");
        }else{
            System.out.println("Habéis empatado");
        }

    }
}