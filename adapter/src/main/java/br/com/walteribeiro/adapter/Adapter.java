package br.com.walteribeiro.adapter;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public final class Adapter {

    private Adapter() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String... args) {
        final AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Rock you like a hurricane");
        audioPlayer.play("mp4", "I Now Pronounce You Chuck and Larry");
        audioPlayer.play("vlc", "Hangover");
        audioPlayer.play("avi", "Two and a half men");
    }
}
