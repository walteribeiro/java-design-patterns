package br.com.walteribeiro.adapter;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public class MediaAdapter implements MediaPlayer {

    MediaPlayerAvancado mediaPlayerAvancado;

    public MediaAdapter(final String audioType) {
        if (Constants.VLC.equalsIgnoreCase(audioType)) {
            mediaPlayerAvancado = new VlcPlayer();
        } else if (Constants.MP4.equalsIgnoreCase(audioType)) {
            mediaPlayerAvancado = new Mp4Player();
        }
    }

    @Override
    public void play(final String audioType, final String fileName) {
        if (Constants.VLC.equalsIgnoreCase(audioType)) {
            mediaPlayerAvancado.playVlc(fileName);
        } else if (Constants.MP4.equalsIgnoreCase(audioType)) {
            mediaPlayerAvancado.playMp4(fileName);
        }
    }
}
