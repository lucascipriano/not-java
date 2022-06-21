package ArraysCollections;

import java.util.HashMap;
import java.util.Map;

public class MapBolado {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        // Put e não add, pois se for chamado mais de uma vez, ele altera.
        usuarios.put(1, "Lucas");
        usuarios.put(1, "Ricardo");
        usuarios.put(2, "Rafael");
        usuarios.put(3, "Rebeca");
        usuarios.put(4, "Katia");


        System.out.println(usuarios);
        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.get(1));

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }

    }
}
