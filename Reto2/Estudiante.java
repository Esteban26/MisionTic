
public class Estudiante {
    public String  nombre;
    public String  edad;
    public String  programa;
    public String  tipoEtnia;

    public Estudiante(String nombre, String edad, String programa, String tipoEtnia) {
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
        this.tipoEtnia = tipoEtnia;
    }


    @Override
    public String toString() {
        return"\tNombre: " + nombre +
                "\n\tEdad: " + edad + " anios"+
                "\n\tPrograma: " + programa +
                "\n\tEtnia: " + tipoEtnia;
    }
}
