public class Persona {
    private int ci;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String signo;
    private int edad;
    private String oficio;

    //Segundo constructor

    public Persona(){

    }

    //Constructor con extends Persona

    public Persona(int ci, String nombre, String apellido, String direccion, String telefono, String signo, int edad, String oficio) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.signo = signo;
        this.edad = edad;
        this.oficio = oficio;
    }


    //Setter y Getter

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    //Funciones
    public void caminar(){
        System.out.println("Este es el metodo de caminar");
    }
    public void trabajar(){
        System.out.println("Este es el metodo de trabajar");
    }
}