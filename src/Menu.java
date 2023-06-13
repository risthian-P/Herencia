public class Menu {
    public static void main(String[] args) {
        Persona mipersona = new Persona(1712345678,
                "Juan",
                "Perez",
                "Colombia",
                "0912345678"); //Pueden ser valores nulos con 0 y ""

        Persona Pedro = new Persona(); //para que esten vacios se debe crear un constructor sin valores, despues del primer constructor, ejemplo en clase Persona line 10
        System.out.println(mipersona.getCi());
        System.out.println(Pedro.getCi());
        Emp_Privado Cristhian2 = new Emp_Privado();
        Estudiante Cristhian = new Estudiante(1751555010,
                "Cristhian",
                "Pañora",
                "Machachi",
                "0963393496",
                202020201,
                "ejemplo@epn.edu.ecc",
                "Tercer",
                "TSDS");

        Cristhian.caminar();
        Cristhian.estudiar();
        Cristhian.trabajar();
    }

}
