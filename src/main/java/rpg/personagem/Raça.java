package rpg.personagem;
import java.util.Random;
public class Raça {

    private String[] racas = {
                "Humano",
                "Elfo",
                "Anão", };

    public String sortearRaca() {

            Random random = new Random();

            int indice = random.nextInt(racas.length);

            return racas[indice];
    }

    }
