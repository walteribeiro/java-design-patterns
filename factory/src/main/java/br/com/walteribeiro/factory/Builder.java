package br.com.walteribeiro.factory;

import br.com.walteribeiro.facade.Circle;
import br.com.walteribeiro.facade.Form;
import br.com.walteribeiro.facade.Rectangle;
import br.com.walteribeiro.facade.Square;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public class Builder {

    public Form getForm(final String formType) {
        final Form form;
        switch (formType) {
            case Constants.CIRCLE:
                form = new Circle();
                break;
            case Constants.RECTANGLE:
                form = new Rectangle();
                break;
            case Constants.SQUARE:
                form = new Square();
                break;
            default:
                form = null;
        }
        return form;
    }
}
