package br.com.walteribeiro.iterator;

/**
 * @author Walter Ribeiro
 * @since 10/04/2020
 */
public final class Iterator {

    private Iterator() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(final String... args) {
        final Repository repository = new Repository();

        for (final CustomIterator iter = repository.getIterator(); iter.hasNext(); ) {
            System.out.println(String.format("Name: %s", (String) iter.next()));
        }
    }
}
