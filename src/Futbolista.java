public class Futbolista extends Persona{
    private String equipo;
    private String posicion;
    private int num_camiseta;
    private String representante;

    public Futbolista(){
        super();
    }

    //Constructor con extends Persona

    public Futbolista(int ci, String nombre, String apellido, String direccion, String telefono, String equipo, String posicion, int num_camiseta, String representante) {
        super(ci, nombre, apellido, direccion, telefono);
        this.equipo = equipo;
        this.posicion = posicion;
        this.num_camiseta = num_camiseta;
        this.representante = representante;
    }
}
