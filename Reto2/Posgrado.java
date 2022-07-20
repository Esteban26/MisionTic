
public class Posgrado extends Estudiante {
    public String modalidad;

    public Posgrado(String nombre, String edad, String programa, String tipoEtnia, String modalidad){
        super(nombre, edad, programa, tipoEtnia);
        this.modalidad = modalidad;
    }
    
    public String toString(){
        return "\tEstudiante Posgrado\n" + super.toString() + "\n\tModalidad: " + modalidad;
    }
}
