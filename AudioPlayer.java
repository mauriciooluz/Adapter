public class AudioPlayer implements MediaPlayer {
    MediaPlayer mediaAdapter;    


    @Override
    public void play(String audioType, String fileName) {
        //inbuilt support to play mp3 music files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Tocando música MP3. Nome: " + fileName);
        }

        //mediaAdapter is providing support to play other file formats
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

        else{
            System.out.println("Mídia inválida. " + audioType + " formato não suportado!");
        }
    }
}