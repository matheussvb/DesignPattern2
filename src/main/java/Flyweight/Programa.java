package Flyweight;

import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        NotasMusicais notasMusicais = new NotasMusicais();


        List<Nota> musica = Arrays.asList(
                notasMusicais.pegaNota("do"),
                notasMusicais.pegaNota("re"),
                notasMusicais.pegaNota("mi"),
                notasMusicais.pegaNota("fa"),
                notasMusicais.pegaNota("fa"),
                notasMusicais.pegaNota("fa"));

        Piano piano = new Piano();
        piano.toca(musica);

    }
}
