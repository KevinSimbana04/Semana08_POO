package modelo;

public class Entrenador extends Persona{
    private String disciplina;

    //Constructor
    public Entrenador(String nombre,String cedula, int edad, String disciplina) {
        super(nombre,cedula, edad);
        this.disciplina = disciplina;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("ENTRENADOR DE: " +nombre+ "Disciplica: " + disciplina);
    }

}
