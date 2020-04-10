package br.com.walteribeiro.bridge;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public abstract class Form {

    protected final DrawApi drawApi;

    protected Form(final DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
