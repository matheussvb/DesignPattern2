package BridgeseAdapters;

public class Programa {
    public static void main(String[] args) throws Exception {

        // regra de negocio
        Mapa mapa = new GoogleMaps();
        mapa.devolveMapa("google maps");

        Mapa mapa1 = new MapLink();
        mapa1.devolveMapa("maplink");


    }
}
