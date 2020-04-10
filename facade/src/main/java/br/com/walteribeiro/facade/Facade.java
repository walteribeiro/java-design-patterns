package br.com.walteribeiro.facade;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public final class Facade {

    private Facade() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String... args) {
        final Factory factory = new Factory();

        factory.drawCircle();
        factory.drawRectangle();
        factory.drawSquare();
    }
}
