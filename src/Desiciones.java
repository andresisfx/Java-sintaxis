public class Desiciones {
    public static void main(String[] args) {

        int fechaDeLanzamiento= 2029;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.5;
        String tipoPlan ="plus";
//        if (fechaDeLanzamiento>2000){
//            System.out.println("peliculas mas populares " );
//        }else{
//            System.out.println("peliculas retro que aun se pueden ver");
//        }
        if (incluidoEnElPlan ||tipoPlan =="plus"){
            System.out.println("Disfrute de su película");
        }else{
            System.out.println("Pelicula no disponible actualiza tu plan");
        }
    }
}
