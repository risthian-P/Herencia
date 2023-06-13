public class Emp_Privado extends Persona{
    private String puesto;
    private String cargo;

    public Emp_Privado(){
        super();
    }

    //Constructor con extends Persona
    public Emp_Privado(int ci,
                       String nombre,
                       String apellido,
                       String direccion,
                       String telefono,
                       String puesto,
                       String cargo) {
        super(ci, nombre, apellido, direccion, telefono);
        this.puesto = puesto;
        this.cargo = cargo;
    }

}
