/**
 * Clase Main.
 * @author Diego Hernandez Vazquez y Hanabi Hernandez Arce
 * @version 1.0                
 * @date 11 sep 2024.           
 */
import java.util.Scanner;
import Especies.Animal;
import Especies.Planta;
import Especies.Fungi;

public class Main {
    public static void main(String[] hanabi) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número (1 para Animal, 2 para Planta, 3 para Fungi):");
        int numero = scanner.nextInt();

        if (numero == 1) {
            // Crear un objeto de la clase Animal
            Animal animal = new Animal("Pingüino emperador", "Aptenodytes forsteri", "Animalia", "Aves", "Sphenisciformes");
            System.out.println(animal);
        } else if (numero == 2) {
            // Crear un objeto de la clase Planta
            Planta planta = new Planta("Girasol", "Helianthus annuus", "Plantae", "Magnoliopsida", "Asterales");
            System.out.println(planta);
        } else if (numero == 3) {
            // Crear un objeto de la clase Fungi
            Fungi fungi = new Fungi("Hongo ostra", "Pleurotus ostreatus", "Fungi", "Agaricomycetes", "Agaricales");
            System.out.println(fungi);
        } else {
            // Si ingresa un número no válido
            System.out.println("Número no válido. Introduce 1, 2 o 3.");
        }

        scanner.close();
    }
}
