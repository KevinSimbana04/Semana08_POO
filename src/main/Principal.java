package main;
 import modelo.Curso;
 import modelo.Entrenador;
 import modelo.Participante;

 import java.lang.classfile.instruction.SwitchCase;
 import java.util.*;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Atributos
        int opcion=0;

        //inicializar objetos
        List<Participante> participantes = new ArrayList<>(30);
        List<Curso> cursos = new ArrayList<>();
        List<Entrenador> entrenadores = new ArrayList<>();

        //Crear Menu
        System.out.println("-------- Sistema de Cursos Deportivos------");
        System.out.println("1. Registro Participante");
        System.out.println("2. Cusros Disponibles por Edad");
        System.out.println("3. Inscripcion de Curso");
        System.out.println("4. Ver inscritos por curso");
        System.out.println("5. Ver Horario de Cancha");
        System.out.println("6. Salir");

        System.out.print("Escoga una opcion:");
        opcion = sc.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Registro Participante");
                break;
            case 2:
                System.out.println("Cusros Disponibles por Edad");
                break;
            case 3:
                System.out.println("Inscripcion de Curso");
                break;
            case 4:
                System.out.println("Inscripcion curso");
                break;
            case 5:
                System.out.println("Horario de cancha");
                break;
            case 6:
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }
}