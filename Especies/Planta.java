/**
 * Clase Planta.
 * @author Diego Hernandez Vazquez y Hanabi Hernandez Arce
 * @version 1.0                
 * @date 11 sep 2024.           
 */
package Especies;

public class Planta {
    //Atributos de la clase Planta
    private String nombreComun;
    private String nombreCientifico;
    private String reino;
    private String clase;
    private String orden;

    // Constructor por parámetros 
    public Planta(String nombreComun, String nombreCientifico, String reino, String clase, String orden) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.reino = reino;
        this.clase = clase;
        this.orden = orden;
    }

    // Método toString     }
    public String toString() {
        return "Planta: " +
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
        Planta planta = (Planta) obj;
        return nombreComun.equals(planta.nombreComun) &&
               nombreCientifico.equals(planta.nombreCientifico) &&
               reino.equals(planta.reino) &&
               clase.equals(planta.clase) &&
               orden.equals(planta.orden);
    }
}
