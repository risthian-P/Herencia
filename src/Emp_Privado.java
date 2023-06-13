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

    //Setter y Getter


    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //metodos

    public void tramitar(){
        System.out.println("Este es el metodo de tramitar");
    }
}
