package modelo;

import java.util.List;

public class Curso {
    //Atributos
    //nombre, disciplina, ed_max, ed_min, horario, entrenador, participantes

    private String nombre;
    private String disciplina;
    private int ed_max;
    private int ed_min;
    private int horario;
    private Entrenador entrenador;
    private List<Participante> inscritos;

    //costructor
    public Curso(String nombre, String disciplina, int ed_max, int ed_min, int horario, Entrenador entrenador, List<Participante> inscritos) {
        this.nombre = nombre;
        this.disciplina = disciplina;
        this.ed_max = ed_max;
        this.ed_min = ed_min;
        this.horario = horario;
        this.entrenador = entrenador;
        this.inscritos = inscritos;
    }

    //Metodo verificar inscripcion
    public boolean ver_incripcion(Participante p) {

        if(inscritos.size()<30 && p.getEdad() >=ed_min && p.getEdad() <=ed_max ) {
            inscritos.add(p);
            return true;
        }
        return false;
    }

    // Metodo mostrar perosnas inscritos
    public void mostrarInscritos() {
        System.out.println("Curso: " +nombre+ "(" +disciplina + ")");
        for(Participante p : inscritos) {
            p.mostrarDatos();
        }
    }

    //
}

