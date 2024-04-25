import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones =0;
        for (int i = 0; i < 3; i++) {
            System.out.println("escribe la nota que le darias a la pel{icula");
            nota = teclado.nextDouble();
            mediaEvaluaciones= mediaEvaluaciones + nota;
        }
        System.out.println(mediaEvaluaciones/3);
    }
}
