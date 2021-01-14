package homework5point2;

public class Player implements Playable, Recordable{
    @Override
    public void play() {
        System.out.println("Play");
    }

    @Override
    public void record() {
        System.out.println("Record");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
