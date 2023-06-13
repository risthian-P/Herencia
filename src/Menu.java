
public class Menu {
    //Cristhian Pañora
    public static void main(String[] args) {
        Doctor Ana = new Doctor(0,"Ana","","","","Leo",33,"Doctora","",0,"","");
        Emp_Privado Pablo = new Emp_Privado(0,"Pablo","","","123456","",0,"","","");
        Futbolista Maritza = new Futbolista(0,"Maritza","","","","",0,"Futbolista","","",0,"",5);
        Estudiante Melani = new Estudiante(0,"Melani","","","","",0,"Estudiante",0,"","3er","");

        System.out.println(Ana.getNombre() +" es "+ Ana.getOficio());
        System.out.println("Tiene "+ Ana.getEdad() + "años");
        System.out.println("Es de signo "+ Ana.getSigno());
        Ana.examinar();
        System.out.println();

        System.out.println(Maritza.getNombre() +" es "+ Maritza.getOficio());
        System.out.println("Entrena "+ Maritza.getHoras() + " horas diarias");
        Maritza.correr();
        System.out.println();

        System.out.println(Pablo.getNombre() +" es "+ Pablo.getOficio());
        System.out.println("Su telefono es:  "+ Pablo.getTelefono());
        Pablo.tramitar();
        System.out.println();

        System.out.println(Melani.getNombre() +" es "+ Melani.getOficio());
        System.out.println("Está en "+ Melani.getSemestre() + " semestre");
        Melani.leer();
    }

}