
public class Pregrado extends Estudiante {
    public String catidadCreditos;
    
    public Pregrado(String nombre, String edad, String programa, String tipoEtnia, String catidadCreditos){
        super(nombre, edad, programa, tipoEtnia);
        this.catidadCreditos = catidadCreditos;
    }
    
    public String toString(){
        return "\tEstudiante Pregrado\n" + super.toString() + "\n\tCreditos aprobados: " + catidadCreditos;
    }
}