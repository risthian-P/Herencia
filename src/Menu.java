public class Menu {
    public static void main(String[] args) {
        Persona mipersona = new Persona(1712345678,
                "Juan",
                "Perez",
                "Colombia",
                "0912345678");

        Persona Pedro = new Persona();
        System.out.println(mipersona.getCi());
        System.out.println(Pedro.getCi());

        Estudiante Cristhian = new Estudiante(1751555010,
                "Cristhian",
                "Pañora",
                "Machachi",
                "0963393496",
                202020201,
                "ejemplo@epn.edu.ecc",
                "Tercer",
                "TSDS");

    }

}
