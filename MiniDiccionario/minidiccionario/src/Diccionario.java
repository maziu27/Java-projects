import java.util.HashMap;
import java.util.Scanner;

public class Diccionario {
    public static void main(String[] args) {
        // hashmap diccionario, <String, String> porque el key es un string y el value tambien
        HashMap<String, String> diccionario = new HashMap<>();

        // poniendo un valor de Key y value para el diccionario, donde el Key es lo que el usuario 
        // busca y el value la traduccion
        diccionario.put("Hola","Hello"); 
        diccionario.put("Adios","Goodbye");
        diccionario.put("Gracias","Thank you");
        diccionario.put("Cristo", "Christ");
        diccionario.put("Pasta termica", "Thermal paste");
        diccionario.put("Pantalla", "Screen");
        diccionario.put("Satélite", "Satellite");
        diccionario.put("Noche", "Night");
        diccionario.put("Bien", "Good");
        diccionario.put("Mal", "Bad");
        diccionario.put("Feliz", "Happy");
        diccionario.put("Bebida", "Drink");
        diccionario.put("Comida", "Food");
        diccionario.put("Hotel", "Hotel");
        diccionario.put("Restaurante", "Restaurant");
        diccionario.put("Musica", "Music");
        diccionario.put("Amigo", "Friend");
        diccionario.put("Casa", "House");
        diccionario.put("Coche", "Car");
        diccionario.put("Libro", "Book");

        Scanner in = new Scanner(System.in);

        System.out.println("Diccionario Español a Inglés");
        System.out.print("Introduce una palabra en español (Primera letra en mayuscula): ");

        String palabraTraducida = in.nextLine(); 

        if (diccionario.containsKey(palabraTraducida)) { //si la palabra del scanner coincide con el Key del Map, 
            System.out.println("La traducción es " + diccionario.get(palabraTraducida)); // el resultado del if coge el value del key con diccionario.get(palabraTraducida)
        }else{
            System.out.println("La palabra te lo has inventado vaya, porque aquí no esta...");
        }
        in.close();
    }
}
