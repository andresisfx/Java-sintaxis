import java.util.Scanner;

public class Lecura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu película favorita");
        String película = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Qué nota le darias a esta película?");
        double nota = teclado.nextDouble();
        System.out.println(película);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);

    }
}
