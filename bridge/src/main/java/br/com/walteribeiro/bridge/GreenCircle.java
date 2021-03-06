package br.com.walteribeiro.bridge;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public class GreenCircle implements DrawApi {

    @Override
    public void drawCircle(final int radius, final int axisX, final int axisY) {
        System.out.println(String.format("Draw circle [color: green, radius: %s, x: %s, y: %s]", radius, axisX, axisY));
    }
}
