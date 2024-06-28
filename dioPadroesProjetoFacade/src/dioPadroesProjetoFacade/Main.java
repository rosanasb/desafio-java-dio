package dioPadroesProjetoFacade;

public class Main {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Lights lights = new Lights();
        Tv tv = new Tv();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, lights, tv);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}

