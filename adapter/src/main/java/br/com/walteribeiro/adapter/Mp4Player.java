package br.com.walteribeiro.adapter;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public class Mp4Player implements MediaPlayerAvancado {

    @Override
    public void playVlc(final String fileName) {
    }

    @Override
    public void playMp4(final String fileName) {
        System.out.println("playing mp4. Name:" + fileName);
    }
}
