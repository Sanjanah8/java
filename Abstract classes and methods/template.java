abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Template method
    public final void playGame() {
        initialize();
        startPlay();
        endPlay();
    }
}

class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialized.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started.");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished.");
    }
}

class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started.");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished.");
    }
}

public class Main {
    public static void main(String[] args) {
        Game football = new Football();
        football.playGame();

        Game cricket = new Cricket();
        cricket.playGame();
    }
}
