package modelo;

public class Participante extends Persona {

    public Participante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }


    //
    @Override
    public void mostrarDatos() {
        System.out.println("PARTICIPANTE:" +nombre+ "Edad:" +edad);
    }


}
