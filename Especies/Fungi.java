/**
 * Clase Fungi.
 * @author Diego Hernandez Vazquez y Hanabi Hernandez Arce
 * @version 1.0                
 * @date 11 sep 2024.           
 */
package Especies;

 public class Fungi {
    //Atributos de la clase Fungi
    private String nombreComun;
    private String nombreCientifico;
    private String reino;
    private String clase;
    private String orden;

    // Constructor por parámetros
    public Fungi(String nombreComun, String nombreCientifico, String reino, String clase, String orden) {
        this.nombreComun = nombreComun;
        this.nombreCientifico = nombreCientifico;
        this.reino = reino;
        this.clase = clase;
        this.orden = orden;
    }

    // Método toString
    public String toString() {
        return "Fungi: " +
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
        Fungi fungi = (Fungi) obj;
        return nombreComun.equals(fungi.nombreComun) &&
               nombreCientifico.equals(fungi.nombreCientifico) &&
               reino.equals(fungi.reino) &&
               clase.equals(fungi.clase) &&
               orden.equals(fungi.orden);
    }
}
