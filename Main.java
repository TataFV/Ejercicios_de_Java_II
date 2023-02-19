public class Main {
    public static void main(String[] args) {
        Participante participante1 = new Participante( 1, 2, 3, "Deku");
        System.out.println(participante1.info());

        Usuario usuario1 = new Usuario ();
        System.out.println(usuario1.getCaraCruz("Cruz"));
        System.out.println(usuario1.getCaraCruz("Cara"));


        Partida partida1 = new Partida();
        partida1.init_partida("Emma", "Nintendo");
        partida1.setTotal_rondas(6);
        partida1.jugar_partida();
    }

}

