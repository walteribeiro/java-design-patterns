package br.com.walteribeiro.bridge;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public final class Bridge {

    private Bridge() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String... args) {
        final Form redCircle = new Circle(100, 100, 10, new RedCircle());
        final Form greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
