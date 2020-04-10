package br.com.walteribeiro.bridge;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public class Circle extends Form {

    private final int axisX;
    private final int axisY;
    private final int radius;

    public Circle(final int axisX, final int axisY, final int radius, final DrawApi drawApi) {
        super(drawApi);
        this.axisX = axisX;
        this.axisY = axisY;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawApi.drawCircle(radius, axisX, axisY);
    }
}
