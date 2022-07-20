import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registro {
    public static List<Estudiante> estudiantes = new ArrayList<>();
    public static void main(String[] args) {
        procesarComandos();
    }

    public static void agregarEstudiante(String estudiante) {
        
        String[] lista = estudiante.split("&");
        String grado = lista[1];


        if (grado.equals("Pregrado")) {
            Pregrado stpre = new Pregrado(lista[2], lista[3], lista[4], lista[5], lista[6]);
            estudiantes.add(stpre);

        }else{
            Posgrado stpos = new Posgrado(lista[2], lista[3], lista[4], lista[5], lista[6]);
            estudiantes.add(stpos);
        }

        procesarComandos();
    }

    public static Scanner sc = new Scanner(System.in);
    public static void procesarComandos(){
        String ingreso = sc.nextLine();
        String opcion = ingreso.substring(0,1);
        switch (opcion) {
            case "1":
                agregarEstudiante(ingreso);
                break;
            case "2":
                listarEstudiantes();
                break;
            case "3":
                break;
            default:
                break;
        }
    }

    public static void listarEstudiantes() {
        System.out.println("***Listado de estudiantes***");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
        procesarComandos();
    }
}


// 1&Pregrado&Luis Parra&21&Medicina&Raizal&15
// 1&Posgrado&María Sarmiento&25&Maestría en economía&Ninguna&Investigación
// 2
// 3