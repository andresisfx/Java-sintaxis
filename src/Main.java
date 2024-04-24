
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Welcome to screen match!");
        System.out.println("  pelicula: Matrix");

        int fechaDeLanzamiento= 19996;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.5;
        double media = (8.5+ 3.25 + 5.3)/3;
        System.out.println( " la media de la película es "+ media);

        String sinopsis= """
                Matrix fue la mejor película del año dosmil y fue lanzada en  
                """ + fechaDeLanzamiento;
        System.out.println( sinopsis);

        String contrasena= "12345";
        if (contrasena.equals("12345")) {
            System.out.println("Acceso autorizado!");
        } else {
            System.out.println("Contraseña incorrecta.");
        }
        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));


        int x1 = 10; // Definir la primera variable x
        double y1 = x1; // Casting implícito

        double x2 = 10.5; // Definir la segunda variable x
        int y2 = (int) x2; // Casting explícito


    }
}
