interface StreamableContent {
    void play();
    void pause();
    void stop();
}

class Movie implements StreamableContent {
    @Override
    public void play() {
        System.out.println("Movie is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Movie is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Movie is stopped.");
    }
}

class Music implements StreamableContent {
    @Override
    public void play() {
        System.out.println("Music is playing.");
    }

    @Override
    public void pause() {
        System.out.println("Music is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Music is stopped.");
    }
}

public class OnlineStreamingSystem {
    public static void main(String[] args) {
        StreamableContent movie = new Movie();
        movie.play();
        movie.pause();
        movie.stop();

        StreamableContent music = new Music();
        music.play();
        music.pause();
        music.stop();
    }
}
