public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc (String fileName) {
        System.out.println("Tocando arquivo VLC. Nome: "+ fileName);
    }
    
    @Override
    public void playMp4 (String fileName) {
        //do nothing
    }
}
