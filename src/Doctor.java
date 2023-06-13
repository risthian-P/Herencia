public class Doctor extends Persona{
    private String especialidad;
    private int codigo;
    private String horario;
    private String hosptal;

    public Doctor(){
        super();
    }

    //Constructor con extends Persona

    public Doctor(int ci, String nombre, String apellido, String direccion, String telefono, String especialidad, int codigo, String horario, String hosptal) {
        super(ci, nombre, apellido, direccion, telefono);
        this.especialidad = especialidad;
        this.codigo = codigo;
        this.horario = horario;
        this.hosptal = hosptal;
    }
}
