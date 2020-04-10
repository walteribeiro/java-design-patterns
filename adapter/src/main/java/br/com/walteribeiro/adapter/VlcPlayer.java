package br.com.walteribeiro.adapter;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public class VlcPlayer implements MediaPlayerAvancado {

    @Override
    public void playVlc(final String fileName) {
        System.out.println("Playing vlc. Name: " + fileName);
    }

    @Override
    public void playMp4(final String fileName) {
    }
}
