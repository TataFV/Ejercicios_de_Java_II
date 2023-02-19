public class Usuario extends Participante{

        public int getCaraCruz(String resultado) {
            resultado = resultado.toLowerCase();
            if (resultado.equals("cara")) {
                return 0;
            } else if (resultado.equals("cruz")) {
                return 1;
            }

            return 2;
        }
}
