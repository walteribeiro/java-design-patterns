package br.com.walteribeiro.facade;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public class Square implements Form {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
