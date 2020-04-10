package br.com.walteribeiro.facade;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public class Factory {

    private final Form circle;
    private final Form rectangle;
    private final Form square;

    public Factory() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
