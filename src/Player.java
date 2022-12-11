public class Player implements Playable, Recordable {

    @Override
    public void play() {
        System.out.println("Play music");
    }

    @Override
    public void record() {
        System.out.println("Record music");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }


    @Override
    public void stop() {
        System.out.println("stop");
    }
}
