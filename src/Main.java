import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Producto reloj = new Producto("abc", "Reloj", 10, 2, Categoria.COMPONENTES);
        Producto moto = new Producto("abc", "Moto", 10, 2, Categoria.COMPONENTES);

        if (reloj.getCategoria() == moto.getCategoria()) {
            System.out.println("Pertenemos a la misma categoria");
        }
            /*ArrayList<Integer> notas = new ArrayList<>();

            notas.add(8);
            notas.add(6);
            notas.add(9);

            for (int i = 0; i < notas.size(); i++) {
                System.out.println(notas.get(i));
                int contenido = notas.get(i);
            }

            System.out.println("");

            for (int contenido : notas){
                System.out.println(contenido);
            }*/

            // Creamos el mapa
            HashMap<String, Integer> notasMap = new HashMap<>();

            // Añadir un nuevo elemento
            notasMap.put("Ana", 8);
            notasMap.put("Luis", 6);
            notasMap.put("Sabela", 9);

            // Actualiza un elemnto
            notasMap.put("Sabela", 56);

            // Accedemos al elemento mediante su llave
            System.out.println(notasMap.get("Luis"));

            // Eliminamos un elemento
            notasMap.remove("Ana");

            // Comprobar si exsite un elemento, utilizando su llave
            if(notasMap.containsKey("Sabela")) {
                System.out.println("Existe un elemento que el contenido de su llave sea Sabela");
            }


            // Mostramos por consola, todo el contenido del mapa con la siguiente estructura:
            // "El valor con llave: LLAVE, tiene un valor asociado de VALOR"
            for (Map.Entry<String, Integer> contenido : notasMap.entrySet()) {
                System.out.println("El valor con llave " + contenido.getKey() +
                        ", tiene un valor asociado de " + contenido.getValue());
            }

            for (String llave : notasMap.keySet()) {
                System.out.println("El valor con llave" + llave);
            }
    }
}