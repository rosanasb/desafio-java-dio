package dioPadroesProjetoFacade;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Lights lights;
    private Tv tv;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Lights lights, Tv tv) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.lights = lights;
        this.tv = tv;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.dim(10);
        amplifier.on();
        amplifier.setVolume(5);
        tv.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.dim(100);
        amplifier.off();
        tv.off();
        dvdPlayer.off();
    }
}
