public class AdapterPatternDemo {
    public static void main (String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "popozao.mp3");
        audioPlayer.play("mp4", "só quer vrau.mp4");
        audioPlayer.play("vlc", "patricinha.vlc");
        audioPlayer.play("avi", "tiger.avi");
    }
}
