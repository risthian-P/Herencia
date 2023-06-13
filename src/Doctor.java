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

    //Setter y Getter

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHosptal() {
        return hosptal;
    }

    public void setHosptal(String hosptal) {
        this.hosptal = hosptal;
    }

    //metodos

    public void examinar(){
        System.out.println("Este es el metodo de examinar");
    }
    public void curar(){
        System.out.println("Este es el metodo de curar");
    }
}
