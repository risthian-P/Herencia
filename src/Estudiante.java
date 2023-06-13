public class Estudiante extends Persona{
    private int codigo;
    private String correo;
    private String semestre;
    private String carrera;

    public Estudiante(int ci, String nombre, String apellido, String direccion, String telefono) {
        super(ci, nombre, apellido, direccion, telefono);
    }

}
