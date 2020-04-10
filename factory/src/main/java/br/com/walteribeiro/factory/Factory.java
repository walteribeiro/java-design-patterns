package br.com.walteribeiro.factory;

import br.com.walteribeiro.facade.Form;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public final class Factory {

    private Factory() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String... args) {
        final Builder builder = new Builder();

        final Form form1 = builder.getForm(Constants.CIRCLE);
        form1.draw();

        final Form form2 = builder.getForm(Constants.RECTANGLE);
        form2.draw();

        final Form form3 = builder.getForm(Constants.SQUARE);
        form3.draw();
    }
}
