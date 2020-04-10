package br.com.walteribeiro.adapter;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(final String audioType, final String fileName) {
        if (Constants.MP3.equalsIgnoreCase(audioType)) {
            System.out.println("playing mp3. Name: " + fileName);
        } else if (Constants.VLC.equalsIgnoreCase(audioType) || Constants.MP4.equalsIgnoreCase(audioType)) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid file. " + audioType + " unsupported format.");
        }
    }
}
