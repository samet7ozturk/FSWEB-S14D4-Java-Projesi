package store.RPGGame;

public interface Poisonable {
    default double poison(){
        return 0.3;
    }
}
