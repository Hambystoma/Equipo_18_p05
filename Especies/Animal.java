/**
 * Clase Animal.
 * @author Diego Hernandez Vazquez y Hanabi Hernandez Arce
 * @version 1.0                
 * @date 11 sep 2024.           
 */
package Especies;
public class Animal {
    // Atributos de la clase Especies
    private String nombreComun;
    private String nombreCientifico;
    private String reino;
    private String clase;
    private String orden;

    // Constructor por parámetros 
    public Animal(String nombreComun, String nombreCientifico, String reino, String clase, String orden) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.reino = reino;
        this.clase = clase;
        this.orden = orden;
    }

    // Método toString
    public String toString() {
        return "Animal: " +
                "Nombre comun: " + nombreComun + '\'' +
                "Nombre cientifico: " + nombreCientifico + '\'' +
                "Reino: " + reino + '\'' +
                "Clase: " + clase + '\'' +
                "Orden: " + orden + '\'';
    }

    // Método equals
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return nombreComun.equals(animal.nombreComun) &&
               nombreCientifico.equals(animal.nombreCientifico) &&
               reino.equals(animal.reino) &&
               clase.equals(animal.clase) &&
               orden.equals(animal.orden);
    }
}
