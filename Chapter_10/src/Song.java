public class Song {
    String title;

    public Song(String title) {
        this.title = title;
    }

    public void play() {
        SoundPlayer player = new SoundPlayer();
        player.playSound();
    }
}
