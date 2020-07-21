package Flyweight;

import org.jfugue.player.Player;

import java.util.List;

public class Piano {
    public void toca(List<Nota> musica) {
        Player player = new Player();

        StringBuilder notasEmMusicas = new StringBuilder();

        for (Nota nota : musica) {
            notasEmMusicas.append(nota + " ");
            System.out.println(nota);
        }

        System.out.println(notasEmMusicas.toString());
        player.play(notasEmMusicas.toString());

    }
}
