package homework5point2;

public class Main {
    public static void main(String[] args) {
        Playable play = new Player();
        play.play();
        play.pause();
        play.stop();
        Recordable record = new Player();
        record.record();
        record.pause();
        record.stop();
    }
}
