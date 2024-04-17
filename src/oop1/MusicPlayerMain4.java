package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        // ON
        player.on();
        //up
        player.volumeUp();
        //up
        player.volumeUp();
        //down
        player.volumeDown();
        //state
        player.showStatus();
        //off
        player.off();
    }
}
